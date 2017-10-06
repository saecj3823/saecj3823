/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assassignment2;

import java.util.Scanner;

/**
 *
 * @author saecj3823
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // say Hello
        System.out.println("Hello World!!");
        System.out.print("Hello");
        System.out.print("World|\n");
        
        //create a scanner for input 
        Scanner input = new Scanner(System.in);        
        
        //Get name from the user 
        System.out.print("Please enter your name");
        String firstName = input.nextLine();
        
        //output the variable to the screen
        System.out.println("Hello "+firstName);
        
        // ask for persons birth year
        System.out.println("Please enter the year that you were born");
       
        //Get the year 
        int birthYear = input.nextInt();
        
        //basic error chcker 
        while(birthYear>2017){
            System.out.println("I don't think so....Try again");
            birthYear=input.nextInt();
                    
        }
        
        // calculate age
        int age = 2017 - birthYear;
        
        System.out.println("You are " + age + " years old");
        
        //for loop to count down from 1-10
        
        
                
        
                }
}
