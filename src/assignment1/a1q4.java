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
 * @Jordan Saechao
 */
public class a1q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a town
        City kitchener = new City();
        //make a robot named mark
        Robot mark= new Robot (kitchener,0,0, Direction.SOUTH);
        Robot ark= new Robot (kitchener,0,1, Direction.SOUTH);
        //create a wall
       new Wall(kitchener,0,1, Direction.WEST);
       new Wall(kitchener,1,1, Direction.WEST);
       new Wall(kitchener,1,1, Direction.SOUTH);
       //get mark to move 
       mark.move();
       ark.move();
       ark.turnLeft();
       mark.move();
       ark.move();
       ark.turnLeft();
       ark.turnLeft();
       ark.turnLeft();
       ark.move();
       mark.turnLeft();
       mark.move();
       ark.turnLeft();
       ark.turnLeft();
       ark.turnLeft();
       ark.move();
       
             
       
       
       
       
    }
}
