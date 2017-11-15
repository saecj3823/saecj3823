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
public class a4q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
         Scanner input = new Scanner(System.in); 
         //get name from user 
             System.out.println("Please enter your name:");     
        String firstName = input.nextLine();   
        
        //get what the first test was out of and their results
        System.out.println("what was the first test out of?");      
        int firstTest = input.nextInt();     
        System.out.println("what mark did you get?");       
        int firstMark = input.nextInt();     
        
        //get what the second test was out of and their results
        System.out.println("what was the second test out of?");    
        int secondTest = input.nextInt();       
        System.out.println("what mark did you get");       
        int secondMark = input.nextInt(); 
        
        //get what the third test was out of and their results
        System.out.println("what was the third test out of?");       
        int thirdTest = input.nextInt();       
        System.out.println("what mark did you get");       
        int thirdMark = input.nextInt();
        
        //get what the fourth test was out of and their results
        System.out.println("what was the fourth test out of?");       
        int fourthTest = input.nextInt();       
        System.out.println("what mark did you get");       
        int fourthMark = input.nextInt();
        
        //get what the fifth test was out of and their results
        System.out.println("what was the fifth test out of?");       
        int fifthTest = input.nextInt();       
        System.out.println("what mark did you get");       
        int fifthMark = input.nextInt();
        //out print what there test scores were out of and what they got 
        System.out.println("Test scores for " + firstName);
        //tell them their marks on the tests 
        double firstTestScore = firstMark / 50.0 * 100 ;
        System.out.println("Test 1: " + firstTestScore + "%");
        
        double secondTestScore = secondMark / 80.0 * 100 ;
        System.out.println("Test 2: " + secondTestScore + "%");
        
        double thirdTestScore = thirdMark / 85.0 * 100 ;
        System.out.println("Test 3: " + thirdTestScore + "%");
        
        double fourthTestScore = fourthMark / 80.0 * 100 ;
        System.out.println("Test 4: " + fourthTestScore + "%");
        
        double fifthTestScore = fifthMark / 45.0 * 100 ;
        System.out.println("Test 5: " + fifthTestScore + "%");
        
        double average = firstTestScore + secondTestScore + thirdTestScore
                + fourthTestScore + fifthTestScore;
        
        double totalAverage = average / 5 ;
        
        System.out.println("Average: " + totalAverage + "%");


         
         
            
         
         
        
         
    }
}
