/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author saecj3823
 */
public class a3q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a City 
        City kitchener = new City();
        //Create a robot inside of kitchener
        Robot mark = new Robot(kitchener, 2, 2, Direction.SOUTH);
        //create walls 
        new Wall(kitchener, 0, 0, Direction.NORTH);
        new Wall(kitchener, 0, 0, Direction.WEST);
        new Wall(kitchener, 1, 0, Direction.WEST);
        new Wall(kitchener, 1, 0, Direction.SOUTH);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        new Wall(kitchener, 1, 1, Direction.EAST);
        new Wall(kitchener, 0, 1, Direction.EAST);
        new Wall(kitchener, 0, 1, Direction.NORTH);
        new Wall(kitchener, 0, 3, Direction.NORTH);
        new Wall(kitchener, 0, 4, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.WEST);
        new Wall(kitchener, 0, 3, Direction.WEST);
        new Wall(kitchener, 1, 4, Direction.SOUTH);
        new Wall(kitchener, 1, 3, Direction.SOUTH);
        new Wall(kitchener, 0, 4, Direction.EAST);
        new Wall(kitchener, 1, 4, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.WEST);
        new Wall(kitchener, 4, 3, Direction.WEST);
        new Wall(kitchener, 4, 3, Direction.SOUTH);
        new Wall(kitchener, 4, 4, Direction.SOUTH);
        new Wall(kitchener, 1, 3, Direction.WEST);
        new Wall(kitchener, 4, 4, Direction.EAST);
        new Wall(kitchener, 3, 4, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.NORTH);
        new Wall(kitchener, 3, 4, Direction.NORTH);
        
        





    }
}
