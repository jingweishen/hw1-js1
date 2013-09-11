

/* First created by JCasGen Tue Sep 10 21:44:22 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** Results of NGram analysis.
 * Updated by JCasGen Tue Sep 10 21:50:58 EDT 2013
 * XML source: C:/Users/sj/git/hw1-js1/hw-js1/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class NGram extends Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGram.class);
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
  protected NGram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGram(JCas jcas, int begin, int end) {
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
  //* Feature: Elements

  /** getter for Elements - gets Show all the tokens inside the type.
   * @generated */
  public FSArray getElements() {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Elements == null)
      jcasType.jcas.throwFeatMissing("Elements", "Model.NGram");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements)));}
    
  /** setter for Elements - sets Show all the tokens inside the type. 
   * @generated */
  public void setElements(FSArray v) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Elements == null)
      jcasType.jcas.throwFeatMissing("Elements", "Model.NGram");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Elements - gets an indexed value - Show all the tokens inside the type.
   * @generated */
  public Token getElements(int i) {
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Elements == null)
      jcasType.jcas.throwFeatMissing("Elements", "Model.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements), i)));}

  /** indexed setter for Elements - sets an indexed value - Show all the tokens inside the type.
   * @generated */
  public void setElements(int i, Token v) { 
    if (NGram_Type.featOkTst && ((NGram_Type)jcasType).casFeat_Elements == null)
      jcasType.jcas.throwFeatMissing("Elements", "Model.NGram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGram_Type)jcasType).casFeatCode_Elements), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    