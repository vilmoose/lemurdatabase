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
public class Lemur extends Mammal{
    public String toString(){
    String output = super.toString();
    output += "They live in Madagascar " + "\n";
    output += "They all have fur " + "\n";
    output += "They are classified as Promisians " + "\n";
    output += "They can groom themselves using their teeth as combs " + "\n";
    output += "Females play a dominant role " + "\n";
    return output;
}  
}

