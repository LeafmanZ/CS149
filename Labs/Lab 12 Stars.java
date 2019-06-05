import java.util.Scanner;

/**
 * Produce star patterns demonstrating nested for loops.
 * Adapted from Lewis and Loftus by Nancy and Arch Harris.
 * 
 * @author JIM ZIELEMAN
 * @version 10/11/2018
 */
public class Stars {

    /**
    * Main Method.
    *@param args not used.
    */    
    public static void main(String[] args) {
        int maxRows;  // maximum number of rows
        int starCnt;  // number of stars per row
        int blnkCnt;  // blanks preceding stars
        
        Scanner stdIn;
        stdIn = new Scanner(System.in);
        
        System.out.print("Enter a positive integer for the number of rows: ");
        maxRows = stdIn.nextInt();
        while (maxRows <= 0) {
            System.out.print("\nYou did not enter a POSITIVE number.");
            System.out.printf(" You entered %d!\n", maxRows);
            System.out.print("Enter a positive number "
                + "for the number of rows: ");
            maxRows = stdIn.nextInt();
        }
        
        // first example: stars per row goes from 1 to maxRows
        System.out.println();
        System.out.println("First Example");
        System.out.println();
        for (int row = 1; row <= maxRows; row++) {
            starCnt = row;
            for (int col = 1; col <= starCnt; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // insert code for Patterns A, B, C, and D below
        // A second example: stars per row goes from maxRows to 1
        System.out.println();
        System.out.println();
        System.out.println("Pattern A");
        System.out.println();
        for (int row = maxRows; row >= 1; row--) {
            starCnt = row;
            for (int col = 1; col <= starCnt; col++) {
                System.out.print("*");
            }
            System.out.println();
        }  
        // B third example: stars per row goes from 1 to maxRows
        System.out.println();
        System.out.println();
        System.out.println("Pattern B");
        System.out.println();
        for (int row = 1; row <= maxRows; row++) {
            starCnt = row;
            for (int col = 1; col <= maxRows - starCnt; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= starCnt; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // C fourth example: stars per row goes from 1 to maxRows
        System.out.println();
        System.out.println();
        System.out.println("Pattern C");
        System.out.println();
        for (int row = maxRows; row >= 1; row--) {
            starCnt = row;
            for (int col = 1; col <= maxRows - starCnt; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= starCnt; col++) {
                System.out.print("*");
            }
            System.out.println();   
        }
        System.out.println();
       // D fifth example: stars per row grow big to small and are centered
        System.out.println();
        System.out.println();
        System.out.println("Pattern D");
        System.out.println();
        for (int row = 1; row <= maxRows - 1; row = row + 2) {
            starCnt = row;
            for (int col = 1; col <= (maxRows - starCnt) / 2; col++) {
               System.out.print(" ");            
            }
            for (int col = 1; col <= starCnt; col++) {
               System.out.print("*");
            }
            System.out.println();   
            }   
            for (int row = maxRows; row >= 1; row = row - 2) {
               starCnt = row;
            for (int col = 1; col <= (maxRows - starCnt) / 2; col++) {
                 System.out.print(" ");
            }
            for (int col = 1; col <= starCnt; col++) {
                 System.out.print("*");
            }
            System.out.println();
        }                 
    }    
}
