

/* First created by JCasGen Tue Sep 10 21:44:22 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Evaluate the precision of one method.
 * Updated by JCasGen Tue Sep 10 21:50:58 EDT 2013
 * XML source: C:/Users/sj/git/hw1-js1/hw-js1/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Evaluation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluation.class);
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
  protected Evaluation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Evaluation(JCas jcas, int begin, int end) {
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
  //* Feature: Precision

  /** getter for Precision - gets Indicating how precise the method is. 
   * @generated */
  public double getPrecision() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "Model.Evaluation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_Precision);}
    
  /** setter for Precision - sets Indicating how precise the method is.  
   * @generated */
  public void setPrecision(double v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "Model.Evaluation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Evaluation_Type)jcasType).casFeatCode_Precision, v);}    
   
    
  //*--------------*
  //* Feature: MethodName

  /** getter for MethodName - gets Telling us which method the evaluation is based on.
   * @generated */
  public String getMethodName() {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_MethodName == null)
      jcasType.jcas.throwFeatMissing("MethodName", "Model.Evaluation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Evaluation_Type)jcasType).casFeatCode_MethodName);}
    
  /** setter for MethodName - sets Telling us which method the evaluation is based on. 
   * @generated */
  public void setMethodName(String v) {
    if (Evaluation_Type.featOkTst && ((Evaluation_Type)jcasType).casFeat_MethodName == null)
      jcasType.jcas.throwFeatMissing("MethodName", "Model.Evaluation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Evaluation_Type)jcasType).casFeatCode_MethodName, v);}    
  }

    