

/* First created by JCasGen Sun Oct 14 20:36:25 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** List of segments
 * Updated by JCasGen Tue Oct 16 20:31:51 EDT 2012
 * XML source: /home/phani/Work/EclipseWS/W2/GIT/hw1-pgadde/src/main/resources/SharedTypeSystem.xml
 * @generated */
public class Segments extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Segments.class);
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
  protected Segments() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Segments(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Segments(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Segments(JCas jcas, int begin, int end) {
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

  /** getter for content - gets list of segments
   * @generated */
  public FSList getContent() {
    if (Segments_Type.featOkTst && ((Segments_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Segments");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Segments_Type)jcasType).casFeatCode_content)));}
    
  /** setter for content - sets list of segments 
   * @generated */
  public void setContent(FSList v) {
    if (Segments_Type.featOkTst && ((Segments_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Segments");
    jcasType.ll_cas.ll_setRefValue(addr, ((Segments_Type)jcasType).casFeatCode_content, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    