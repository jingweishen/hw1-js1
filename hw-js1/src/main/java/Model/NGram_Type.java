
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

/** Results of NGram analysis.
 * Updated by JCasGen Tue Sep 10 21:50:58 EDT 2013
 * @generated */
public class NGram_Type extends Base_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGram(addr, NGram_Type.this);
  			   NGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGram(addr, NGram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Model.NGram");
 
  /** @generated */
  final Feature casFeat_Elements;
  /** @generated */
  final int     casFeatCode_Elements;
  /** @generated */ 
  public int getElements(int addr) {
        if (featOkTst && casFeat_Elements == null)
      jcas.throwFeatMissing("Elements", "Model.NGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Elements);
  }
  /** @generated */    
  public void setElements(int addr, int v) {
        if (featOkTst && casFeat_Elements == null)
      jcas.throwFeatMissing("Elements", "Model.NGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_Elements, v);}
    
   /** @generated */
  public int getElements(int addr, int i) {
        if (featOkTst && casFeat_Elements == null)
      jcas.throwFeatMissing("Elements", "Model.NGram");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Elements), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Elements), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Elements), i);
  }
   
  /** @generated */ 
  public void setElements(int addr, int i, int v) {
        if (featOkTst && casFeat_Elements == null)
      jcas.throwFeatMissing("Elements", "Model.NGram");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Elements), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Elements), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Elements), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Elements = jcas.getRequiredFeatureDE(casType, "Elements", "uima.cas.FSArray", featOkTst);
    casFeatCode_Elements  = (null == casFeat_Elements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Elements).getCode();

  }
}



    