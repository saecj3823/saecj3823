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
public class a4q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner 
        Scanner input = new Scanner(System.in);
        //get prices for all of the items 
         System.out.println("How much does the food cost");
         int food = input.nextInt();
         System.out.println("How much does the DJ cost");
         int dj = input.nextInt();
         System.out.println("How much does it cost to rent the hall");
         int hall = input.nextInt();
         System.out.println("How much does decorations cost");
         int decor = input.nextInt();
         System.out.println("How much did staff cost");
         int staff = input.nextInt();
         System.out.println("How much for miscellaneous costs");
         int misc = input.nextInt();
         //Get system to add the total cost of everything 
         int totalCost = food+ dj+ hall+ decor+ staff+ misc;
         //Tell the user how much the costs came too
         System.out.println("Total cost is"+totalCost);
         //Find out how many tickets are needed in order to break even  
         int amountTickets = totalCost / 35;
         
         System.out.println("You will need to sell" + amountTickets + "tickets to break even");
         
         
         
                 
         
                 
         
        
}
    }
