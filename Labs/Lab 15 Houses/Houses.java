/**
 * Houses - uses StrDraw libary to draw a house.
 * @author Nathan Sprague
 * @version 2016
 */

public class Houses {

    /** 
     * Main method draws a door.
     * @param args = not used
     * 
     */
    public static void main(String[] args) {
        drawHouse(.2, .5);
        drawHouse(.5, .5);
        drawHouse(.8, .5);
    }

    /** 
     * drawDoor method draws a door.
     * @param x = x coordinate
     * @param y = y coordinate
     * 
     */  
    public static void drawDoor(double x, double y) {
        final double WIDTH = .05;
        final double HEIGHT = .1;
        final double KNOB_RADIUS = .005;
        final double KNOB_OFFSET = -.01;
      
        StdDraw.rectangle(x, y, WIDTH / 2, HEIGHT / 2);
        StdDraw.filledCircle(x - KNOB_OFFSET, y, KNOB_RADIUS);
    }

    /** 
     * drawHouse method draws a house.
     * @param x = x coordinate
     * @param y = y coordinate
     * 
     */  
    public static void drawHouse(double x, double y) {
        final double WIDTH = .2;
        final double HEIGHT = .2;
        StdDraw.rectangle(x, y, WIDTH / 2, HEIGHT / 2);
        StdDraw.line(x - .1, y + .1, x, y + .2);
        StdDraw.line(x + .1, y + .1, x, y + .2);
        drawDoor(x, y - .05);
    }
        
}
