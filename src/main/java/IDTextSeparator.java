import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

/**
 * 
 */

/**
 * @author phani
 *
 */
public class IDTextSeparator extends JCasAnnotator_ImplBase {

  /* (non-Javadoc)
   * @see org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org.apache.uima.jcas.JCas)
   */
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    String sentence = aJCas.getDocumentText();
    String[] splittedSentence = sentence.split(" ");
    String id = sentence.split(" ")[0];
    String text = "";
    for (int index = 1; index < splittedSentence.length-1; index++)
      text += splittedSentence[index]+" ";
    text += splittedSentence[splittedSentence.length-1];
    Sentence S = new Sentence(aJCas);
    S.setBegin(0);
    S.setEnd(text.length());
    S.setId(id);
    S.setText(text);
    S.addToIndexes();
    //System.out.println("Here is the text:"+text);
  }

}
