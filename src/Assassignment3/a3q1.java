/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assassignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author saecj3823
 */
public class a3q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city 
        City kitchener = new City();
        //create a robot 
        Robot mark= new Robot (kitchener,1,2, Direction.WEST);
        //create walls 
        new Wall(kitchener,2,1, Direction.NORTH);
        new Wall(kitchener,2,0, Direction.NORTH);
        new Wall(kitchener,3,0, Direction.WEST);
        new Wall(kitchener,2,0, Direction.WEST);
        new Wall(kitchener,3,1, Direction.SOUTH);
        new Wall(kitchener,3,0, Direction.SOUTH);
        new Wall(kitchener,3,1, Direction.EAST);
        new Wall(kitchener,2,1, Direction.EAST);
        //
        for(int count=0;count < 8; count = count + 1){
           //mark move 
            mark.move();
            mark.move();
            mark.move();
            mark.turnLeft();
            
        }
    
        
    }
}
