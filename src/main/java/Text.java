

/* First created by JCasGen Sun Oct 14 20:05:29 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Text in each line
 * Updated by JCasGen Sun Oct 14 22:09:42 EDT 2012
 * XML source: /usr0/home/pgadde/EclipseWorkspaces/SE/hw1-pgadde/src/main/resources/collectionReaderDescriptor.xml
 * @generated */
public class Text extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Text.class);
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
  protected Text() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Text(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Text(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Text(JCas jcas, int begin, int end) {
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

  /** getter for content - gets the content of the text
   * @generated */
  public String getContent() {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Text");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Text_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets the content of the text 
   * @generated */
  public void setContent(String v) {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Text");
    jcasType.ll_cas.ll_setStringValue(addr, ((Text_Type)jcasType).casFeatCode_content, v);}    
   
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets Text ID
   * @generated */
  public String getId() {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "Text");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Text_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets Text ID 
   * @generated */
  public void setId(String v) {
    if (Text_Type.featOkTst && ((Text_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "Text");
    jcasType.ll_cas.ll_setStringValue(addr, ((Text_Type)jcasType).casFeatCode_id, v);}    
  }

    