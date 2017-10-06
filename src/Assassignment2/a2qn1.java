/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assassignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author Jordan Saechao
 */
public class a2qn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city 
        City kitchener= new City();
        //create a robot 
        Robot mark= new Robot (kitchener,1,1, Direction.EAST);
        //drop items in front of mark
        new Thing (kitchener,1,2);
        new Thing (kitchener,1,3);
        new Thing (kitchener,1,4);
        new Thing (kitchener,1,5);
        new Thing (kitchener,1,6);
        new Thing (kitchener,1,7);
        new Thing (kitchener,1,8);
        new Thing (kitchener,1,9);
        new Thing (kitchener,1,10);
        new Thing (kitchener,1,11);
        new Thing (kitchener,1,12);
        //until robot hits wall
        while (mark.frontIsClear()){
         if (mark.countThingsInBackpack()<8) {
             //if can pick thing 
             if (mark.canPickThing()) {
                 //pick up thing 
                 mark.pickThing();
             }
             
         }
         
         //get mark  to stop at avenue 12
         if (mark.getAvenue()<13    ){
             //get mark to move 
             mark.move();
            
             
             
                 
         }
         
       
            
        }
              
        
                
    }
}
