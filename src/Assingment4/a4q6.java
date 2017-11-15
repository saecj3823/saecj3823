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
        //Output to user to enter the recorded speed of the car 
        System.out.println("Enter the recorded speed of the car");
        int speedCar = input.nextInt();
        //Fine for each car for the each fine that uo can receive 
        int fineOne = 100;
        int fineTwo = 270;
        int fineThree = 500;
        //if the car speed is within the limit output 
        if (speedCar < speedLimit) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if(speedCar >= speedLimit + 1 && speedCar <= speedLimit + 20){
            System.out.println("You are speeding and your fine is $" + fineOne);
        }
        if(speedCar >= speedLimit + 21 && speedCar <= speedLimit + 30){
            System.out.println("You are speeding and your fine is $" + fineTwo);
        }
        if(speedCar >= speedLimit + 31 && speedCar <= speedLimit + 123123){
            System.out.println("You are speeding and your fine is $" + fineThree);

       
        
    }

    }
}
