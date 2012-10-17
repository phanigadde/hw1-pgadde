

/* First created by JCasGen Sun Oct 14 20:05:29 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.IntegerList;


/** Each segment that is given a named entity
 * Updated by JCasGen Tue Oct 16 20:31:51 EDT 2012
 * XML source: /home/phani/Work/EclipseWS/W2/GIT/hw1-pgadde/src/main/resources/SharedTypeSystem.xml
 * @generated */
public class Segment extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Segment.class);
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
  protected Segment() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Segment(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Segment(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Segment(JCas jcas, int begin, int end) {
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

  /** getter for content - gets A sequence of words, that constitutes a segment
   * @generated */
  public StringList getContent() {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Segment");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Segment_Type)jcasType).casFeatCode_content)));}
    
  /** setter for content - sets A sequence of words, that constitutes a segment 
   * @generated */
  public void setContent(StringList v) {
    if (Segment_Type.featOkTst && ((Segment_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Segment");
    jcasType.ll_cas.ll_setRefValue(addr, ((Segment_Type)jcasType).casFeatCode_content, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    