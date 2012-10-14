import org.apache.uima.analysis_component.Annotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.AbstractCas;

/**
 * 
 */

/**
 * @author pgadde
 *
 */
public class SentenceSegmenter extends Annotator_ImplBase {

  /**
   * 
   */
  public SentenceSegmenter() {
    
  }

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
    

  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
