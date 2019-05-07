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
public class TreeLemur extends Lemur {
    public String toString(){
        String output = super.toString();
        output += "They travel in large groups " + "\n";
        output += "They eat fruit " + "\n";
        output += "They have red mane ";
        return output;
    }
}
