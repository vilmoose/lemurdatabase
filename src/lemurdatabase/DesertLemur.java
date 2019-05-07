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
public class DesertLemur extends Lemur{
    public String toString(){
        String output = super.toString();
        output += "They obtain water from cacti " + "\n";
        output += "They white coats reflect the desert heat " + "\n";
        output += "Two-thirds of the babies die due to puncture wounds from the cacti ";
        return output;
    }
}
