/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Jordan Saechao
 */
public class a1q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
        //Make new robot named Mark
        Robot mark= new Robot (kitchener,3,2, Direction.WEST);
        //Make walls 
        new Wall(kitchener,4,2, Direction.NORTH);
        new Wall(kitchener,4,1, Direction.NORTH);
        new Wall(kitchener,4,2, Direction.EAST);
        new Wall(kitchener,5,2, Direction.EAST);
        new Wall(kitchener,5,1, Direction.SOUTH);
        new Wall(kitchener,5,2, Direction.SOUTH);
        new Wall(kitchener,4,1, Direction.WEST);
        new Wall(kitchener,5,1, Direction.WEST);
        // get mark to move
        mark.move();
        mark.move();
        mark.turnLeft();
        mark.move();
        mark.move();
       mark.move();
       mark.turnLeft();
       mark.move();
       mark.move();
       mark.move();
       mark.turnLeft();
       mark.move();
       mark.move();
       mark.move();
       mark.turnLeft();
       mark.move();
    }
}
