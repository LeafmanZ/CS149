import java.util.Scanner;

/**
 * Converts a Celsius temperature to an equivalent Fahrenheit temperature.
 *
 * @author Jim Zieleman
 * @version 09/11/18
 */
public class Celsius {

    /**
     * Inputs the temperature in celsius and outputs the equivalent temperature
     * in Fahrenheit. In addition, formats the results with 1 decimal place.
     *
     * EXAMPLES - Provide 3 examples for testing:
     *      Celsius    Fahrenheit
     * 1. 0C to 32F
     * 2. 100C to 212F
     * 3. -10C to 14F
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
    
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);
        
        // Get the Celsius.
        System.out.print(
            "Enter in a Celsius temperature to convert to Fahrenheit: ");
        double celsius = in.nextDouble();
        
        // Calculate fahrenheit from input celsius
        double fh = celsius * 1.8 + 32;
        
        // Print the fahrenheit to 1 decimal places
        System.out.printf(
            "Your temperature of " + celsius 
            + " degrees Celsius is %.1f degrees Fahrenheit\n", fh);
        // Print the fahrenheit in its truncated integer value
        System.out.printf("Wow, that's like %d degrees!\n", (int) fh);
        // Print the fHeit in its truncated integer value with 7 spaces infront
        System.out.printf("Wow, that's like %8d degrees!\n", (int) fh);
        // Print out the $ value of the fHeit times 1 million to 2 decimals
        System.out.printf(
            "If I had $1M for every degree, I'd have $%,.2f!\n", fh * 1e6);

    }

}
