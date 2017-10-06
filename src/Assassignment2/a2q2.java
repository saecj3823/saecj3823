/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assassignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * Jordan Saechao
 */
public class a2q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city 
         City kitchener = new City();
         //create a robot 
         Robot mark= new Robot (kitchener,1,1,Direction.EAST);
         //create walls
        new Wall(kitchener,1,2, Direction.SOUTH);
        new Wall(kitchener,1,1, Direction.SOUTH);
        new Wall(kitchener,1,1, Direction.EAST);
        new Wall(kitchener,1,2, Direction.EAST);
        new Wall(kitchener,1,3, Direction.SOUTH);
        new Wall(kitchener,1,4, Direction.SOUTH);
        new Wall(kitchener,1,4, Direction.EAST);
        new Wall(kitchener,1,5, Direction.SOUTH);
        new Wall(kitchener,1,6, Direction.SOUTH);
        new Wall(kitchener,1,7, Direction.SOUTH);
        new Wall(kitchener,1,7, Direction.EAST);
        new Wall(kitchener,1,8, Direction.SOUTH);
        new Wall(kitchener,1,9, Direction.SOUTH);
        //drop item
        new Thing (kitchener,1,9);
        //Until robot hits wall
        while (!mark.canPickThing()){
            if (mark.frontIsClear()){
                mark.move();
            
            }else{
                mark.turnLeft();
                mark.move();
                mark.turnLeft();
                mark.turnLeft();
                mark.turnLeft();
                mark.move();
           
               
                
                
    }
}


              
       
            
            
        }

    }

