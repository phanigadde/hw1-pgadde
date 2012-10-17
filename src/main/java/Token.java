

/* First created by JCasGen Tue Oct 16 20:31:26 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A word
 * Updated by JCasGen Tue Oct 16 20:31:26 EDT 2012
 * XML source: /home/phani/Work/EclipseWS/W2/GIT/hw1-pgadde/src/main/resources/SimpleTypeSystem.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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

  /** getter for content - gets the content of the string
   * @generated */
  public String getContent() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets the content of the string 
   * @generated */
  public void setContent(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_content, v);}    
  }

    