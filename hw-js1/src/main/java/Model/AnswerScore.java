

/* First created by JCasGen Tue Sep 10 21:44:22 EDT 2013 */
package Model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Inherited from Model.Answer. It also has a numeric feature of score, indicating how good the answer is. 
 * Updated by JCasGen Tue Sep 10 21:50:58 EDT 2013
 * XML source: C:/Users/sj/git/hw1-js1/hw-js1/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class AnswerScore extends Answer {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScore.class);
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
  protected AnswerScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerScore(JCas jcas, int begin, int end) {
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
  //* Feature: Score

  /** getter for Score - gets Indicating how good an answer is.
   * @generated */
  public double getScore() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "Model.AnswerScore");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_Score);}
    
  /** setter for Score - sets Indicating how good an answer is. 
   * @generated */
  public void setScore(double v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "Model.AnswerScore");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_Score, v);}    
  }

    