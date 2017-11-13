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
public class a4q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner 
        Scanner input = new Scanner(System.in);
        //Get the system to output text to user 
        System.out.println("Please enter 4 numbers on seperate lines");
        //get the numbers and place all 4 on seperate linse

        String n1 = input.nextLine();
        String n2 = input.nextLine();
        String n3 = input.nextLine();
        String n4 = input.nextLine();

        System.out.println("Your numbers were" + n1 + "," + n2 + "," + n3 + "," + n4);

    }
}
