/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Jordan Saechao
 */
public class a1q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City kitchener = new City();
         //create 2 robots 
         Robot mark= new Robot (kitchener,0,1, Direction.WEST);
         Robot ark= new Robot (kitchener,3,3, Direction.EAST);
         //create a wall
         new Wall(kitchener,3,3, Direction.EAST);
         new Wall(kitchener,3,3, Direction.SOUTH);
         new Wall(kitchener,2,3, Direction.EAST);
         new Wall(kitchener,2,3, Direction.NORTH);
         new Wall(kitchener,2,3, Direction.WEST);
         //make items on the map
        new Thing(kitchener,0,0);
        new Thing(kitchener,1,0);
        new Thing(kitchener,1,1);
        new Thing(kitchener,1,2);
        new Thing(kitchener,2,2);
        //get mark to 
        mark.move();
        mark.pickThing();
        ark.turnLeft();
        ark.turnLeft();
        ark.move();
        ark.turnLeft();
        ark.turnLeft();
        ark.turnLeft();
        ark.move();
         mark.turnLeft();
         mark.move();
        ark.pickThing();
         mark.pickThing();
        ark.move();
        ark.pickThing();
        ark.turnLeft();
       mark.canPickThing();
        mark.turnLeft();
        mark.move();
        mark.pickThing();


    }
}
