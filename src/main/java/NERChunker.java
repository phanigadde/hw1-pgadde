import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;

/**
 * 
 */

/**
 * @author phani
 * 
 */
public class NERChunker extends JCasAnnotator_ImplBase {

  public static final String PARAM_MODELFILE = "modelFile";

  private String mFile;

  public void initialize(UimaContext context) {
    mFile = (String) context.getConfigParameterValue(PARAM_MODELFILE);
  }

  private int numSpaces(String str, int tillIndex) {
    int count = 0;
    for (int index = 0; index < tillIndex; index++)
      if (str.charAt(index) == ' ')
        count++;
    return count;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org.apache.uima.jcas.JCas)
   */
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    FSIndex genIndex = aJCas.getAnnotationIndex(Sentence.type);
    Iterator I = genIndex.iterator();
    while (I.hasNext()) {
      Sentence S = (Sentence) I.next();
      String text = S.getText();
      File modelFile = new File(mFile);
      System.out.println("Reading chunker from file=" + modelFile);
      Chunker chunker = null;
      try {
        chunker = (Chunker) AbstractExternalizable.readObject(modelFile);
        Chunking chunking = chunker.chunk(text);
        Set<Chunk> chunkSet = chunking.chunkSet();
        for (Chunk C : chunkSet) {
          System.out.println("Chunk:"+C);
          int chunkStart = C.start();
          int chunkEnd = C.end();
          System.out.println(chunkStart+" "+chunkEnd);
          String chunkText = text.substring(chunkStart, chunkEnd);
          System.out.println(chunkText);
          Gene G = new Gene(aJCas);
          G.setBegin(chunkStart - numSpaces(text, chunkStart));
          G.setEnd(chunkEnd - numSpaces(text, chunkEnd) - 1);
          G.setContent(chunkText);
          G.addToIndexes();
        }
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
