/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assassignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author saecj3823
 */
public class a3q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city 
        City kitchener = new City();
        kitchener.showThingCounts(true);
        //create a robot 
        Robot mark= new Robot (kitchener,1,1, Direction.EAST);
        //drop items 
        new Thing (kitchener,1,1);
        new Thing (kitchener,1,1);
        new Thing (kitchener,1,1);
        new Thing (kitchener,1,1);
        new Thing (kitchener,1,1);
        new Thing (kitchener,1,1);
        new Thing (kitchener,1,1);
        new Thing (kitchener,1,1);
        new Thing (kitchener,1,1);
        new Thing (kitchener,1,1);
        //
        for(int count=0;count < 10; count = count + 1){
            mark.pickThing();
            mark.move();
            mark.putThing();
            
            mark.turnLeft();
            mark.turnLeft();
            mark.move();
            mark.turnLeft();
            mark.turnLeft();
           
            
            
        }
         //make mark move to final situation
        mark.move();
        
    }
}
