import java.util.Scanner;

/**
 * PA4: TerminalUI.
 *
 * @author JIM ZIELEMAN
 * @version 10/19/2018
 */
public class TerminalUI {
      
    /**
     * promptForString method where we get get a string after asking for it.
     * @param in to get the the string
     * @param message is the message displayed
     * @param min is the minimum number of chars otherwise we reprompt
     * @return promptForString where we ask for a string
     */   
    public static String promptForString(Scanner in, String message, int min) {
        
        // we have a variable to keep track of the input length
        int length = 0;
        // we add a variable for our input
        String input = "";
        // check while the input is big enough otherwise reprompt
        while (length < min) {
        
            // print our message or question 
            System.out.print(message + ": ");
            // look for an input value;
            input = in.nextLine();
            // set the length equal to the input strings length
            length = input.length(); 
            
        }
        // return the string inputted
        return input;     
    }
    
    /**
     * promptForInt method where we get get an int after asking for it.
     * @param in to get the the string
     * @param message is the message displayed
     * @param max is the maximum number of chars otherwise we reprompt
     * @return promptForInt where we ask for an int
     */     
    public static int promptForInt(Scanner in, String message, int max) {
        
        // we add variable for our input
        int input = 0;
        // print our message or question
        System.out.print(message + ": ");
        // look for an input value;
        input = in.nextInt();
        // check while the input is smallenough otherwise repromt
        while (input > max || input <= 0) {
            
            // print our message or question
            System.out.print(message + ": ");
            // look for an input value
            input = in.nextInt();
        }
        // clear scanner
        in.nextLine();
        // return the integer inputted
        return input;
    }
    
    /**
     * promptNDisplayHints method where we show hints.
     * @param in to get the the string
     * @param solution is the full answer
     */        
    public static void promptNDisplayHints(Scanner in, String solution) {
        
        // we add variable for our input
        String input = "";
        // we add variable to see if we are still asking questions for hints
        boolean stillAsking = true;
        
        // we want the message question session to continue 
        // playing until its over
        while (stillAsking) {
            // print our message or question
            System.out.print("Want a hint? Enter\n\"f\" for "
                + "first letter\n\"s\" for first slice\n"
                + "\"w\" for whole word\n\"n\" for none: ");
            // get our input value
            input = in.nextLine();
        
            // check what input we got and where the program will continue
            // if the user enters n or any other response we stop prompting
            if (input.equals("f")) {
            
                // since we have f we print out the first letter of the solution
                System.out.print(solution.charAt(0) + " ");
            } else if (input.equals("s")) {
        
                // since we have s we print out the first slice of the solution
                System.out.print(solution.substring(
                    0, solution.length() / 2) + " ");
            } else if (input.equals("w")) {
            
                // since we have w we print out the entire solution
                System.out.print(solution + " ");
            } else {
        
                // since we have any other entry we exit the options
                System.out.print("");
                // we exit the loop by setting stillAsking to false
                stillAsking = false;
            }
        }
    }   
}
