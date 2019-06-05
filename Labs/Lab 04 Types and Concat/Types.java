import java.util.Scanner;

/**
 * Lab04: Input in Java, data types, and compatibility.
 * This program experiments with Scanner and assignment.
 *
 * @author Jim Zieleman
 * @version 09/06/18
 */
public class Types {
    
    /**
     * Java types are only compatible when the values you
     * are assigning are smaller than the initial type.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // declarations
        int num1;
        int num2;
        double val1;
        double val2;
        Scanner input;
        String text;
        
        // initialization
        num2 = 50;
        val2 = 172.5;
        input = new Scanner(System.in);
        
        // read and echo a number
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.println("The number you entered is " + num1);
        
        // 4
        // read and echo a double
        System.out.print("Enter a number: ");
        val1 = input.nextDouble();
        System.out.println("The number you entered is " + val1);
        
        // 5
        // read and echo a string
        System.out.print("Enter a word: ");
        text = input.next();
        System.out.println("The word you entered is " + text);
       
        // Part 3.1
        // val1 = text;
        
        // Part 3.2
        // num1 = val1;
        
        // Part 3.3 
        val2 = val1;
        
        // Part 3.4 
        System.out.println("val1 is" + val1 + "val2 is" + val2);
        
        // part 3.5
        val2 = num1;
        
        // part 3.6
        System.out.println("num1 is" + num1 + "val2 is" + val2);
    
    }
    
}
