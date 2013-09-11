
/* First created by JCasGen Tue Sep 10 21:44:22 EDT 2013 */
package Model;

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

/** Evaluate the precision of one method.
 * Updated by JCasGen Tue Sep 10 21:50:58 EDT 2013
 * @generated */
public class Evaluation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluation(addr, Evaluation_Type.this);
  			   Evaluation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluation(addr, Evaluation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Model.Evaluation");
 
  /** @generated */
  final Feature casFeat_Precision;
  /** @generated */
  final int     casFeatCode_Precision;
  /** @generated */ 
  public double getPrecision(int addr) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "Model.Evaluation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Precision);
  }
  /** @generated */    
  public void setPrecision(int addr, double v) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "Model.Evaluation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Precision, v);}
    
  
 
  /** @generated */
  final Feature casFeat_MethodName;
  /** @generated */
  final int     casFeatCode_MethodName;
  /** @generated */ 
  public String getMethodName(int addr) {
        if (featOkTst && casFeat_MethodName == null)
      jcas.throwFeatMissing("MethodName", "Model.Evaluation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_MethodName);
  }
  /** @generated */    
  public void setMethodName(int addr, String v) {
        if (featOkTst && casFeat_MethodName == null)
      jcas.throwFeatMissing("MethodName", "Model.Evaluation");
    ll_cas.ll_setStringValue(addr, casFeatCode_MethodName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Precision = jcas.getRequiredFeatureDE(casType, "Precision", "uima.cas.Double", featOkTst);
    casFeatCode_Precision  = (null == casFeat_Precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Precision).getCode();

 
    casFeat_MethodName = jcas.getRequiredFeatureDE(casType, "MethodName", "uima.cas.String", featOkTst);
    casFeatCode_MethodName  = (null == casFeat_MethodName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_MethodName).getCode();

  }
}



    