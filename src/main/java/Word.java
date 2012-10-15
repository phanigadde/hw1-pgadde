

/* First created by JCasGen Sun Oct 14 20:05:29 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.IntegerList;


/** Each Word in the text
 * Updated by JCasGen Sun Oct 14 22:09:42 EDT 2012
 * XML source: /usr0/home/pgadde/EclipseWorkspaces/SE/hw1-pgadde/src/main/resources/collectionReaderDescriptor.xml
 * @generated */
public class Word extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Word.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Word() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Word(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Word(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Word(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: content

  /** getter for content - gets word content
   * @generated */
  public String getContent() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Word");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Word_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets word content 
   * @generated */
  public void setContent(String v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Word");
    jcasType.ll_cas.ll_setStringValue(addr, ((Word_Type)jcasType).casFeatCode_content, v);}    
  }

    