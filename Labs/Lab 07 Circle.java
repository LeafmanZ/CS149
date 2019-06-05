import java.util.Scanner;

/**
* We do coding in JAVA. We are doing lab 7.
*
* @author Jim Zieleman
* @version 09/14/2018
* Acknowledgements: I received no outside help on this assignment and have 
* abided by the JMU Honor Code.
*/

public class CirclePlay {
    
    /**
    * Will simply print some lines to greet the user upon running the 
    * application.
    */
    public static void printGreeting() {
        System.out.println("Welcome to the CS149 Circle Calculator");
        System.out.println("");
        System.out.println(
            "This application will calculate the area " 
            + "of a circle and/or volume of a sphere.");
        System.out.println("");
    }
    
    /**
    * Displays a prompt to the user, then reads in a double value
    * that the user has entered.
    * @return a double value representing a radius
    */
    public static double enterRadius() {
        
        // Make a double
        double radius;
        
        // Make a scanner
        Scanner in = new Scanner(System.in);
        
        // Prompt for the Radius
        System.out.println("Enter the radius: ");
        radius = in.nextDouble();
        
        return radius;
    }
    
    /**
    * Calculate the area of a circle with a given radius.
    *
    * @param enterRadius double value that is enterRadius
    * @return a double value that is the area 
    */
    public static double calculateArea(double enterRadius) {
        
        // Make a double
        double area;
        double radius = enterRadius;
        
        // Calculate area
        area = radius * radius * Math.PI;
        
        return area;
    }
    
    /**
    * Calculate the volume of a circle with a given radius.
    *
    * @param enterRadius double value that is enterRadius
    * @return a value that is the volume 
    */
    public static double calculateVolume(double enterRadius) {
        
        // Make a double
        double volume;
        double radius = enterRadius;
        
        // Calculate area
        volume = (radius * radius * radius * Math.PI * 4.0) / 3.0;
        
        return volume;
    }

}
