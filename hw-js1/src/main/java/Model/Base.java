

/* First created by JCasGen Tue Sep 10 21:44:21 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A base annotation to help keep track of where an annotation was originally made by, and how confidence the annotation was.
 * Updated by JCasGen Tue Sep 10 21:50:57 EDT 2013
 * XML source: C:/Users/sj/git/hw1-js1/hw-js1/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Base extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Base.class);
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
  protected Base() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Base(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Base(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Base(JCas jcas, int begin, int end) {
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
  //* Feature: Sentence

  /** getter for Sentence - gets A string which tell us the original senctence where the annotation come from. 
   * @generated */
  public String getSentence() {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "Model.Base");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Base_Type)jcasType).casFeatCode_Sentence);}
    
  /** setter for Sentence - sets A string which tell us the original senctence where the annotation come from.  
   * @generated */
  public void setSentence(String v) {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "Model.Base");
    jcasType.ll_cas.ll_setStringValue(addr, ((Base_Type)jcasType).casFeatCode_Sentence, v);}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets Indicating how confident the annotation is
   * @generated */
  public double getConfidence() {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "Model.Base");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Base_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets Indicating how confident the annotation is 
   * @generated */
  public void setConfidence(double v) {
    if (Base_Type.featOkTst && ((Base_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "Model.Base");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Base_Type)jcasType).casFeatCode_Confidence, v);}    
  }

    