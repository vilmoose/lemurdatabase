/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

import java.util.Scanner;

/**
 *
 * @author vifeh1685
 */
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the number of lemurs you would like");
        Scanner input = new Scanner(System.in);
        int lemurInput = input.nextInt();
        Lemur[] lemur = new Lemur[lemurInput];
        
        for(int i = 0; i < lemurInput; i++){
            
            System.out.println("Pick one of the following: " + "\n " + "1.-Desert"
                    + "Lemur " + "\n " + "2.- Jungle Lemur " + "\n " + "3.- Tree"
                    + "Lemur");
            Scanner choiceInput = new Scanner(System.in);
            int choice = choiceInput.nextInt();
            
            if(choice == 1){
                Mammal pop = new Mammal();
                pop.setAge(4);
                pop.setGender("Male");
                pop.setWeight(56);
                lemur[i] = new DesertLemur();
                
            } else if(choice == 2){
                Mammal popo = new Mammal();
                popo.setAge(4);
                popo.setGender("Male");
                popo.setWeight(56);
                lemur[i] = new JungleLemur();
                
            }else if(choice == 3){
            Mammal popop = new Mammal();
                popop.setAge(4);
                popop.setGender("Male");
                popop.setWeight(56);
                lemur[i] = new TreeLemur();
                
            }
            
            for(int h = 0; h < lemurInput; h++){
                System.out.println(lemur[h]);
            }
        }
    }
    
}
