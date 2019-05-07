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
public class JungleLemur extends Lemur {
    public String toString(){
        String output = super.toString();
        output += "They have black or blue coats " + "\n";
        output += "They have no mane " + "\n";
        output += "They travel in small groups " + "\n";
        output += "They eat mice, snails, and insects ";
        return output;
    }
}
