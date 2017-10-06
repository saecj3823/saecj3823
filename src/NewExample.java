
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saecj3823
 */
public class NewExample {
    private static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a city
        City KW= new City();
        Robot mark = new Robot(kw,2,2, Direction.EAST);
        // put a wall
        new Wall(kw,2,5,Direction.EAST);
        
    }
}
