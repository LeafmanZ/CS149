import java.util.Scanner;

/**
* We do coding in JAVA. We are doing lab 6.
*
* @author Jim Zieleman
* @version 09/13/2018
* Acknowledgements: I received no outside help on this assignment and have 
* abided by the JMU Honor Code.
*/

public class Seconds {
    /**
    * Takes inputs of time and prints out the seconds.
    *
    * @param args we have an arguements
    */
    
    public static void main(String[] args) {
        // Create variables.
        int truSec;
        int hrs;
        int min;
        int sec;
              
        // Create a Scanner object to read input.
        Scanner in = new Scanner(System.in);
      
        // Get the seconds.
        System.out.print("Enter the number of seconds: ");
        truSec = in.nextInt();
        
        // Calculate
        hrs = truSec / 3600;
        min = (truSec % 3600) / 60;
        sec = (truSec % 3600) % 60;
        
        System.out.println("");
        System.out.println(
            truSec + " seconds = " + hrs + " hours, " 
            + min + " minutes, and " + sec + " seconds");
        // Add a blank space bby and ill getcha name
        System.out.println("");
    }

}
