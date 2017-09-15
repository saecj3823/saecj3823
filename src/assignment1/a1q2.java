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
public class a1q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Make a new city 
        City kitchener = new City();
        //make a new robot 
         Robot mark= new Robot (kitchener,3,2, Direction.SOUTH);
         //make walls around mark '
          new Wall(kitchener,3,2, Direction.SOUTH);
          new Wall(kitchener,3,2, Direction.EAST);
          new Wall(kitchener,3,2, Direction.NORTH);
          new Wall(kitchener,3,1, Direction.NORTH);
          new Wall(kitchener,3,1, Direction.WEST);
          new Wall(kitchener,4,1, Direction.WEST);
          new Wall(kitchener,4,1, Direction.SOUTH);
          //create newspaper 
          new Thing(kitchener,4,2);
          //get mark to move towards thing 
          mark.turnLeft();
          mark.turnLeft();
          mark.turnLeft();
          mark.move();
          mark.turnLeft();
          mark.move();
          mark.turnLeft();
          mark.move();
          //get mark to pick up thing
          mark.pickThing();
          //Get mark to go back to his bed 
          mark.turnLeft();
          mark.turnLeft();
          mark.move();
          mark.turnLeft();
          mark.turnLeft();
          mark.turnLeft();
          mark.move();
         mark.turnLeft();
         mark.turnLeft();
         mark.turnLeft();
         mark.move();
         mark.turnLeft();
         mark.turnLeft();
         mark.turnLeft();
      
         
         
    }
}
