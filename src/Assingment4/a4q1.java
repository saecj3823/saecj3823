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
public class a4q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in); 
        //get name from user 
        System.out.print("Please enter your name");
        String firstName = input.nextLine();
       
        //greet user 
        
        System.out.println("Hello my boi "+firstName);
        
        
    }
}
