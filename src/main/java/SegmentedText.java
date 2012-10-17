

/* First created by JCasGen Sun Oct 14 21:12:53 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** The text segmented into words
 * Updated by JCasGen Tue Oct 16 20:31:51 EDT 2012
 * XML source: /home/phani/Work/EclipseWS/W2/GIT/hw1-pgadde/src/main/resources/SharedTypeSystem.xml
 * @generated */
public class SegmentedText extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SegmentedText.class);
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
  protected SegmentedText() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SegmentedText(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SegmentedText(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SegmentedText(JCas jcas, int begin, int end) {
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

  /** getter for content - gets List of segmented words
   * @generated */
  public FSList getContent() {
    if (SegmentedText_Type.featOkTst && ((SegmentedText_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "SegmentedText");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SegmentedText_Type)jcasType).casFeatCode_content)));}
    
  /** setter for content - sets List of segmented words 
   * @generated */
  public void setContent(FSList v) {
    if (SegmentedText_Type.featOkTst && ((SegmentedText_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "SegmentedText");
    jcasType.ll_cas.ll_setRefValue(addr, ((SegmentedText_Type)jcasType).casFeatCode_content, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: id

  /** getter for id - gets Text ID
   * @generated */
  public String getId() {
    if (SegmentedText_Type.featOkTst && ((SegmentedText_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "SegmentedText");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SegmentedText_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets Text ID 
   * @generated */
  public void setId(String v) {
    if (SegmentedText_Type.featOkTst && ((SegmentedText_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "SegmentedText");
    jcasType.ll_cas.ll_setStringValue(addr, ((SegmentedText_Type)jcasType).casFeatCode_id, v);}    
  }

    