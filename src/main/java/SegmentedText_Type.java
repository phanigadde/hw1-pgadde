
/* First created by JCasGen Sun Oct 14 21:12:53 EDT 2012 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** The text segmented into words
 * Updated by JCasGen Tue Oct 16 20:31:51 EDT 2012
 * @generated */
public class SegmentedText_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SegmentedText_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SegmentedText_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SegmentedText(addr, SegmentedText_Type.this);
  			   SegmentedText_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SegmentedText(addr, SegmentedText_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SegmentedText.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("SegmentedText");
 
  /** @generated */
  final Feature casFeat_content;
  /** @generated */
  final int     casFeatCode_content;
  /** @generated */ 
  public int getContent(int addr) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "SegmentedText");
    return ll_cas.ll_getRefValue(addr, casFeatCode_content);
  }
  /** @generated */    
  public void setContent(int addr, int v) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "SegmentedText");
    ll_cas.ll_setRefValue(addr, casFeatCode_content, v);}
    
  
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "SegmentedText");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "SegmentedText");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public SegmentedText_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_content = jcas.getRequiredFeatureDE(casType, "content", "uima.cas.FSList", featOkTst);
    casFeatCode_content  = (null == casFeat_content) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_content).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

  }
}



    