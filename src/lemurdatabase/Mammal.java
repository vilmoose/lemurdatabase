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
public class Mammal {
  private int itsAge;
  private int itsWeight;
  private String breed;

  public Mammal() {
    itsAge = 2;
    itsWeight = 5;
  }

  public int getAge() {
    return itsAge;
  }

  public int getWeight() {
    return itsWeight;
  }

  public void setAge(int newAge) {
    itsAge = newAge;
  }

  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String newBreed) {
    breed = newBreed;
  }
  
}
