/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingment4;

import java.util.Scanner;

/**
 *
 * @author saecj3823
 */
public class a4q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner 
         Scanner input = new Scanner(System.in);    
//Get the system to output text to the user 
         System.out.println("Please enter the measurement in inches you wish to convert");
         //get the measurement 
         int inches = input.nextInt();  
         //calculate the centimeters from inches 
         double centimeters =inches*2.54 ;
         //output the length 
         System.out.println("The conversion from inches to centimeters is " + centimeters + " centimeters");
        
           
         
         
         
         
         
         
         
                 
           
        
         
         
         
    }
    
}
