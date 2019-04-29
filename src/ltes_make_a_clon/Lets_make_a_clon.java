/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltes_make_a_clon;

/**
 *
 * @author sergio
 */
public class Lets_make_a_clon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        try {  
             
            Human h1 = new Human("Victor");  
            Human h2 = (Human) h1.clone();  
            
                        
            if (h1 == h2) {
                System.out.println("You did not clone the object.");
            }
            else {
                System.out.println("Created a human called: " + h1.name);  
                System.out.println("Created a clone called: " + h2.name);  
            }
              
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }  
    }
    
}
