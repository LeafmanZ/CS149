import java.util.Scanner;

/**
* We do coding in JAVA. We are making a Bakery receipt printout.
*
* @author Jim Zieleman
* @version 09/07/2018
* Acknowledgements: I received no outside help on this assignment and have 
* abided by the JMU Honor Code.
*/

public class Bakery {
    /**
    * Takes inputs from the Bakery and prints out the answers.
    *
    * @param args we have an arguement
    */
    
    public static void main(String[] args) {
        /**
        Enter Customer's Personal Name: Jordan
        Enter Customer's Family Name: Lee
        Enter Product Code: cake22
        Enter Product Quantity: 12
        Enter Product Price: 0.99
        Enter Discount Percent: 10 
        */
      
        // Create a Scanner object to read input.
        Scanner in = new Scanner(System.in);
      
        // Get the first name.
        System.out.print("Enter Customer's Personal Name: ");
        String firstName = in.nextLine();
      
        // Get the last name.
        System.out.print("Enter Customer's Family Name: ");
        String lastName = in.nextLine();
      
        // Get the product code.
        System.out.print("Enter Product Code: ");
        String pCode = in.nextLine();
      
        // Get the quantity ordered.
        System.out.print("Enter Product Quantity: ");
        int pQnt = in.nextInt();
      
        // Get the price of the product.
        System.out.print("Enter Product Price: ");
        double pPrice = in.nextDouble();
      
        // Get the discount percent.
        System.out.println("Enter Discount Percent: ");
        int discount = in.nextInt();
      
        // Variables solved
        double tax = 5.3;
        double initialCost = pQnt * pPrice;
        double discVal = (initialCost * discount) * .01;
        double taxValue = ((initialCost - discVal) * tax) * .01;
        double finalCost = initialCost - discVal + taxValue;
      
        // Print header
        System.out.println("*****                  *****");
        System.out.println("\\___/ BRENDON'S BAKERY \\___/");
        // Print blank
        System.out.println("");
        // Print name
        System.out.println(firstName + " " + lastName);
        // Print date.
        System.out.println("Date: 09/07/2018");
        // Print blank
        System.out.println("");
      
        // Print ProductQtyPrice
        System.out.println("Product\tQty\tPrice");
        System.out.println("-------\t---\t-----");
        // Print ProductQtyPrice values
        System.out.println(pCode + "\t" + pQnt + "\t\t$" + pPrice); 
        // Print blank
        System.out.println("");
      
        // Print initial cost:
        System.out.println("Initial Cost: $" + initialCost);
        // Print discount:
        System.out.println("Discount at " + discount + ".0%: $" + discVal);
        // Print tax:
        System.out.println("Tax at 5.3%: $" + taxValue);
        // Print final cost:
        System.out.println("Final Cost: $" + finalCost);
        // Print blank
        System.out.println("");
      
    }

}
