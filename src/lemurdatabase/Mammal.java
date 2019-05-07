/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

/**
 *
 * @author vifeh1685
 */
public class Mammal extends LemurDatabase{
  private int itsAge;
  private int itsWeight;
  private String itsGender;

//   public String toString(){
//    String output = " ";
//    return output;    
//   }

  public Mammal() {
    
  }
  public String toString(){
      String output = " ";
      output += "Age : " + itsAge + "\n ";
      output += "Weight: " + itsWeight + "kg" + "\n ";
      output += "Gender: " + itsGender + "\n ";
      return output;
   }
  public int getAge() {
    return itsAge;
  }

  public int getWeight() {
    return itsWeight;
  }
  
  public String getGender(){
      return itsGender;
  }
  
  public void setGender(String newGender){
     itsGender = newGender;
  }
  public void setAge(int newAge) {
    itsAge = newAge;
  }

  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }
  
}
