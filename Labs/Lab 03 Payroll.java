import java.util.Scanner;

/**
* CS149.
*
* @author Jim Zieleman
* @version 09/07/2018
* Acknowledgements: I received no outside help on this assignment and have 
* abided by the JMU Honor Code.
*/

public class Payroll {
    /**
    * Main runs the program.
    *
    * @param args we have an arguement
    */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = keyboard.nextLine();
        System.out.print("How many hours did you work this week? ");
        int h = keyboard.nextInt();
        System.out.print("What is your hourly pay rate? ");
        double payRate;
        double grossPay;
        payRate = keyboard.nextDouble();
        grossPay = h * payRate;
        final double BONUS = 500; 
        grossPay = grossPay + BONUS;
        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);
        
    }
}
