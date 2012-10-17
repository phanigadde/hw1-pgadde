

/* First created by JCasGen Wed Oct 17 01:56:38 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The Gene Chunk
 * Updated by JCasGen Wed Oct 17 01:56:38 EDT 2012
 * XML source: /home/phani/Work/EclipseWS/W2/GIT/hw1-pgadde/src/main/resources/SharedTypeSystem.xml
 * @generated */
public class Gene extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gene.class);
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
  protected Gene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Gene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Gene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Gene(JCas jcas, int begin, int end) {
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

  /** getter for content - gets The content of the Gene
   * @generated */
  public String getContent() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets The content of the Gene 
   * @generated */
  public void setContent(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_content, v);}    
  }

    