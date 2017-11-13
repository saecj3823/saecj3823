/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author saecj3823
 */
public class a3q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // Create a city 
        City kitchener = new City();
        //create a robot 
        Robot mark = new Robot(kitchener, 1, 1, Direction.EAST, 20);
//Get mark to move and drop thing 5 spaces
        for (int count = 0; count < 5; count = count + 1) {
            mark.putThing();
            mark.move();

        }
        mark.turnLeft();
        mark.turnLeft();
        mark.turnLeft();
        mark.move();
        mark.turnLeft();
        mark.turnLeft();
        mark.turnLeft();
        mark.move();
        //get mark to repeat what he did earlier
        for (int count = 0; count < 5; count = count + 1) {
            mark.putThing();
            mark.move();

        }
        //make mark turn
        mark.turnLeft();
        mark.move();
        mark.turnLeft();
        mark.move();
        //get mark to move 6 spaces but dropping things at first 5 spots moved
        for (int count = 0; count < 5; count = count + 1) {
            mark.putThing();
            mark.move();

        }
        //get mark to get back into position to plant more seeds
        mark.turnLeft();
        mark.turnLeft();
        mark.turnLeft();
        mark.move();
        mark.turnLeft();
        mark.turnLeft();
        mark.turnLeft();
        mark.move();
        //get mark to plant seeds
        for (int count = 0; count < 5; count = count + 1) {
            mark.putThing();
            mark.move();
        }







    }
}
