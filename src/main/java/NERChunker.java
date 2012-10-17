import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CAS;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;

/**
 * @author phani NERChunker uses lingpipe to extract genes from a sentence's text. <br>
 *         @ Param modelFile The lingpipe model file that's trained for Genetag This model is read
 *         initialize method and used for each sentence. <br>
 */
public class NERChunker extends JCasAnnotator_ImplBase {

  public static final String PARAM_MODELFILE = "modelFile";

  private String mFile;

  private Chunker chunker;

  /**
   * Initializes this CAS Processor with the parameters specified in the descriptor.
   * 
   * @throws ClassNotFoundException
   *           if there is error in reading the model file
   * @param UimaContext
   *          Provides access to external resources (respources outside of the CAS)
   *          Reuired here to read the paramater value of modelFile
   */
  public void initialize(UimaContext context) {
    mFile = (String) context.getConfigParameterValue(PARAM_MODELFILE);
    File modelFile = new File(mFile);
    try {
      chunker = (Chunker) AbstractExternalizable.readObject(modelFile);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  /**
   * Returns the number of white spaces in the given string till some index
   * @param str
   *        The string in which spaces are to be counted
   * @param tillIndex
   *        The index until which spaces are to be counted
   * @return int
   */
  private int numSpaces(String str, int tillIndex) {
    int count = 0;
    for (int index = 0; index < tillIndex; index++)
      if (str.charAt(index) == ' ')
        count++;
    return count;
  }

  /**
   * Processes the CasContainer which was populated by the TextAnalysisEngines.
   * In this case, a sentence is taken from the CAS index and applied the NER model from lingpipe
   * 
   * @param aCAS
   *          CasContainer which has been populated by the TAEs
   * 
   * @throws ResourceProcessException
   *           if there is an error in processing the Resource
   * 
   * @see org.apache.uima.collection.base_cpm.CasObjectProcessor#processCas(CAS)
   */
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    FSIndex genIndex = aJCas.getAnnotationIndex(Sentence.type);
    Iterator I = genIndex.iterator();
    while (I.hasNext()) {
      Sentence S = (Sentence) I.next();
      String text = S.getText();
      Chunking chunking = chunker.chunk(text);
      Set<Chunk> chunkSet = chunking.chunkSet();
      for (Chunk C : chunkSet) {
        // System.out.println("Chunk:"+C);
        int chunkStart = C.start();
        int chunkEnd = C.end();
        // System.out.println(chunkStart+" "+chunkEnd);
        String chunkText = text.substring(chunkStart, chunkEnd);
        // System.out.println(chunkText);
        Gene G = new Gene(aJCas);
        G.setBegin(chunkStart - numSpaces(text, chunkStart));
        G.setEnd(chunkEnd - numSpaces(text, chunkEnd) - 1);
        G.setContent(chunkText);
        G.addToIndexes();
      }
    }
  }

}
