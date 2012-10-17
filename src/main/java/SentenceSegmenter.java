import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import edu.stanford.nlp.objectbank.TokenizerFactory;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;
import edu.stanford.nlp.process.Tokenizer;
import edu.stanford.nlp.ling.Word;
import java.io.StringReader;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author phani
 *
 */
public class SentenceSegmenter extends JCasAnnotator_ImplBase {

  /* (non-Javadoc)
   * @see org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org.apache.uima.jcas.JCas)
   */
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    
    String text = aJCas.getDocumentText();
    TokenizerFactory<Word> factory = PTBTokenizerFactory.newTokenizerFactory();
    Tokenizer<Word> tokenizer = factory.getTokenizer(new StringReader(text));
    ArrayList<Word> tokens = (ArrayList<Word>) tokenizer.tokenize();
    for (Word w:tokens) {
      Token T = new Token(aJCas);
      T.setContent(w.word());
      T.setBegin(0);
      T.setEnd(0);
      T.addToIndexes();
    }
  }

}
