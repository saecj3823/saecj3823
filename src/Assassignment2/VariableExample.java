/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assassignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author saecj3823
 */
public class VariableExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city 
 City kitchener = new City();
 //make a robot named mark
 Robot mark= new Robot (kitchener,1,1,Direction.EAST);
 //create a move counting variable 
 int  moveCounter = 0;
 //continue when counter is less than 10
 while(moveCounter < 10){
     //move forward 
     mark.move();
     //add one to move counter
     moveCounter = moveCounter +1;
 }
 //mark turn left 
 mark.turnLeft();
 mark.turnLeft();
 
 
 
    
    
 }
     
 
    }

