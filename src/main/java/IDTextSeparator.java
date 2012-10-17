import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceProcessException;

/**
 * @author phani
 * Class that separates the ID and text in the input sentence
 */
public class IDTextSeparator extends JCasAnnotator_ImplBase {

  /*
   * Nothing to initialize
   */
  
  /**
   * Processes the CasContainer which was populated by the TextAnalysisEngines. <br>
   * In this case, the CAS index is iterated over selected annotations and printed out into an
   * output file
   * 
   * @param aJCAS
   *          CasContainer which has been populated by the TAEs
   * 
   * @throws AnalysisEngineProcessException
   *           if there is an error in processing
   */
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    String sentence = aJCas.getDocumentText();
    String[] splittedSentence = sentence.split(" ");
    
    String id = sentence.split(" ")[0]; //Getting the ID
    
    String text = "";
    for (int index = 1; index < splittedSentence.length-1; index++)
      text += splittedSentence[index]+" ";
    text += splittedSentence[splittedSentence.length-1];
    Sentence S = new Sentence(aJCas);
    //Begin and End of the sentence is the begin and end of the text
    S.setBegin(0);
    S.setEnd(text.length());
    S.setId(id);
    S.setText(text);
    
    S.addToIndexes(); //Adding to the index
    
  }

}
