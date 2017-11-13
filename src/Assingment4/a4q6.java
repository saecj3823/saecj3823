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
public class a4q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Create a Scanner for input
        Scanner input = new Scanner(System.in);
        // Tell the user to enter the speed limit and the cars speed
        System.out.println("Enter the speed limit:");
        int speedLimit = input.nextInt();
//
        System.out.println("Enter the recorded speed of the car");
        int speedCar = input.nextInt();

        int fineOne = 100;
        int fineTwo = 270;
        int fineThree = 500;


        if (speedCar < speedLimit) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if(speedCar >= speedLimit + 1 && speedCar <= speedLimit + 20){
            System.out.println("You are speeding and your fine is $" + fineOne);
        }
        if(speedCar >= speedLimit + 21 && speedCar <= speedLimit + 30){
            System.out.println("You are speeding and your fine is $" + fineTwo);
        }
        if(speedCar >= speedLimit + 31 && speedCar <= speedLimit + 1000000){
            System.out.println("You are speedingand your fnie is $" + fineThree);

       
        
    }

    }
}
