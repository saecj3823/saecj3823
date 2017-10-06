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
public class a2q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City 
        City kitchener = new City();
        //create a robot 
        Robot mark = new Robot(kitchener, 5, 7, Direction.EAST);
        //get mark to move 
        while (mark.getDirection() != Direction.WEST) {
            
        }
    }
}
