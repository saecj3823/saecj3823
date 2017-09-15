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
public class a1q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create city called kitchener
        City kitchener = new City();
        //create robot 
        Robot Mark = new Robot(kitchener, 3, 2, Direction.EAST);
        //Create thing 
      new Thing(kitchener,3,3);
      //create walls 
      new Wall(kitchener,3,4, Direction.WEST);
      new Wall(kitchener,3,4, Direction.NORTH);
      new Wall(kitchener,2,5, Direction.WEST);
      new Wall(kitchener,1,5, Direction.WEST);
      new Wall(kitchener,1,5, Direction.NORTH);
      new Wall(kitchener,1,5, Direction.EAST);
      new Wall(kitchener,2,6, Direction.NORTH);
      new Wall(kitchener,2,6, Direction.EAST);
      new Wall(kitchener,3,6, Direction.EAST);
      //Mark move
      Mark.move();
      Mark.turnLeft();
      //Get mark to ping thing up
      Mark.pickThing();
      //Get mark to move
      Mark.move();
      Mark.turnLeft();
      Mark.turnLeft();
      Mark.turnLeft();
      Mark.move();
      Mark.turnLeft();
      Mark.move();
      Mark.move();
      Mark.turnLeft();
      Mark.turnLeft();
      Mark.turnLeft();
      Mark.move();
      //get mark to drop item
      Mark.putThing();
      //make mark move again 
      Mark.move();
      Mark.turnLeft();
      Mark.turnLeft();
      Mark.turnLeft();
      Mark.move();
      Mark.turnLeft();
      Mark.move();
      Mark.turnLeft();
      Mark.turnLeft();
      Mark.turnLeft();
      Mark.move();
      Mark.move();
      Mark.turnLeft();
    }
}
