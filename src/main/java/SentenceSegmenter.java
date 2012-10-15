import java.io.StringReader;

import org.apache.uima.analysis_component.Annotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.AbstractCas;

import edu.stanford.nlp.objectbank.TokenizerFactory;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;
import edu.stanford.nlp.process.Tokenizer;
import edu.stanford.nlp.ling.Word;


/**
 * 
 */

/**
 * @author pgadde
 *
 */
public class SentenceSegmenter extends Annotator_ImplBase {


  /* (non-Javadoc)
   * @see org.apache.uima.analysis_component.AnalysisComponent#getRequiredCasInterface()
   */
  @Override
  public Class<? extends AbstractCas> getRequiredCasInterface() {
    
    return null;
  }

  /* (non-Javadoc)
   * @see org.apache.uima.analysis_component.AnalysisComponent#process(org.apache.uima.cas.AbstractCas)
   */
  @Override
  public void process(AbstractCas arg0) throws AnalysisEngineProcessException {
    Text T = (Text) arg0;
    String text = T.getContent();
    TokenizerFactory<Word> factory = PTBTokenizerFactory.newTokenizerFactory();
    Tokenizer<Word> tokenizer = factory.getTokenizer(new StringReader(text));
    System.out.println(tokenizer.tokenize());
  }

}
