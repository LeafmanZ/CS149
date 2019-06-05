import java.util.Scanner;

/**
* We do coding in JAVA. We are making a Bakery receipt printout.
*
* @author Jim Zieleman
* @version 09/21/2018
* Acknowledgements: I received no outside help except for working with the  
* help of shot (I don't know his real name) on this assignment and have 
* abided by the JMU Honor Code.
*/

public class Bakery2 {
   
    /** 
    * TAX_RATE tax rate is constant.
    */
    public static final double TAX_RATE = 5.3;
   
    /**
    * TAX_RATE_PERCENT tax rate is constant and is now a decimal percentage.
    */
    public static final double TAX_RATE_PERCENT = TAX_RATE / 100;
   
    /**
    * DISCOUNT discount rate is constant.
    */ 
    public static final int DISCOUNT = 20;
   
    /** 
    * DISCOUNT_CASTDOUBLE discount rate is constant and is now a double.
    */
    public static final double DISCOUNT_CASTDOUBLE = ((double) DISCOUNT) / 100;
   
    /**
    * QUANTITY_RATIO discount rate is constant and is now a ratio to modify
    * our quantity.
    */
    public static final double QUANTITY_RATIO = 1.0 - DISCOUNT_CASTDOUBLE;
    
    /**
    * Takes inputs from the Bakery2 and prints out the answers.
    *
    * @param args we are inputting, storing, calculating, and displaying 
    * the final reciept.
    */    
    public static void main(String[] args) {
       
        // Create the scanner variable so that we can input data into program
        Scanner in = new Scanner(System.in);
        
        // inputLine for first name
        String first = inputLine(in, "Enter Customer's Personal Name: ");
        // inputLine for last name
        String last = inputLine(in, "Enter Customer's Family Name: ");
        
        // inputLine product code
        String c1 = inputLine(in, "Enter Product1 Code: ");
        // inputLine quantity code
        int q1 = (int) inputNumber(in, "Enter Product1 Quantity: ");
        // inputLine price of good
        double p1 = inputNumber(in, "Enter Product1 Price: ");
        // complete call of the first set of product
        in.nextLine();
        
        // inputLine product code
        String c2 = inputLine(in, "Enter Product2 Code: ");
        // inputLine quantity code
        int q2 = (int) inputNumber(in, "Enter Product2 Quantity: ");
        // inputLine price of good
        double p2 = inputNumber(in, "Enter Product2 Price: ");
        // complete call of the second set of product
        in.nextLine();
        
        // inputLine product code
        String c3 = inputLine(in, "Enter Product3 Code: ");
        // inputLine quantity code
        int q3 = (int) inputNumber(in, "Enter Product3 Quantity: ");
        // inputLine price of good
        double p3 = inputNumber(in, "Enter Product3 Price: ");
        // complete call of the second set of product
        // Print blank
        System.out.println("");
        
        
        // Calculations
        // Calculating total cost
        double initialTotalCost1 = q1 * p1;
        double initialTotalCost2 = q2 * p2;
        double initialTotalCost3 = q3 * p3;
        double initialTotalCost = initialTotalCost1 + initialTotalCost2
            + initialTotalCost3;
        
        // Calculating total discounted
        double totalDiscount1 = (((q1 / 12) * 12) * p1) * DISCOUNT_CASTDOUBLE;
        double totalDiscount2 = (((q2 / 12) * 12) * p2) * DISCOUNT_CASTDOUBLE;
        double totalDiscount3 = (((q3 / 12) * 12) * p3) * DISCOUNT_CASTDOUBLE;
        double totalDiscount = totalDiscount1 + totalDiscount2 + totalDiscount3;
        
        // Calculating price discounted
        double discountedPrice1 = (((q1 / 12) * 12) * p1) 
            * QUANTITY_RATIO + q1 % 12 * p1;
        double discountedPrice2 = (((q2 / 12) * 12) * p2) 
            * QUANTITY_RATIO + q2 % 12 * p2;
        double discountedPrice3 = (((q3 / 12) * 12) * p3) 
            * QUANTITY_RATIO + q3 % 12 * p3;
        double discountedPrice = discountedPrice1 
            + discountedPrice2 + discountedPrice3;
        
        // Calculate total tax
        double totalTax = discountedPrice * TAX_RATE_PERCENT;
        
        // Calculate final cost
        double finalCost = discountedPrice + totalTax;
        
        // Calculate avg product cost
        double avgProductCost = discountedPrice / (q1 + q2 + q3);
        
        // Call heading method
        printHeading(first, last);
        
        // Print the table on for the receipt  
        // Print ProductDozedExtraPrice
        System.out.println("Product\tDozen\tExtra\tPrice/1");
        System.out.println("-------\t-----\t-----\t-------");
        // Call printProduct method
        printProduct(c1, q1, p1);
        printProduct(c2, q2, p2);
        printProduct(c3, q3, p3);
        // Print blank
        System.out.println("");
      
        // Print initial cost:
        System.out.printf("Initial Cost Total: $%.2f\n", initialTotalCost); 
        // Print discount:
        System.out.printf("Total Discount at " + DISCOUNT 
            + "%%: $%.2f\n", totalDiscount);
        // Print average product cost
        System.out.printf("Average Product Cost: $%.2f\n", avgProductCost);
        // Print tax:
        System.out.printf("Total Tax at " + TAX_RATE + "%%: $%.2f\n", totalTax);
        // Print final cost:
        System.out.printf("Final Cost: $%.2f\n", finalCost);
        // Print blank
        System.out.println("");
      
    }    
    /**
    *
    * @param in will consume the prompt line
    * @param prompt what the users inputs are
    * @return value as a double if user enters 2 would return 2.0
    */
    
    public static double inputNumber(Scanner in, String prompt) {
         
        // Create a Scanner object value to get the prompted value
        System.out.print(prompt);
        double value = in.nextDouble();
        
        // Give back value when the method is called
        return value;
    }
    
    /**
    *
    * @param in will consume the prompt line
    * @param prompt what the users inputs are
    * @return phrase as a String
    */
    
    public static String inputLine(Scanner in, String prompt) {       
        
        // Create a Scanner object value to get the prompted value
        System.out.print(prompt);
        String phrase = in.nextLine();
        
        // Give back the phrase when the method is called
        return phrase;
    }
    
    /**
    *
    * @param firstName inputs name as a String
    * @param lastName inputs name as a String
    */
    
    public static void printHeading(String firstName, String lastName) { 
        
        // Print header
        System.out.println("*****                  *****");
        System.out.println("\\___/ BRENDON'S BAKERY \\___/");
        // Print blank
        System.out.println("");
        // Print name
        System.out.println(firstName + " " + lastName);
        // Print date.
        System.out.println("Date: 09/21/2018");
        // Print blank
        System.out.println("");
    }
    
    /**
    * Caculates the amount of dozens and extras their product price.
    * @param code inputs a String through scanner
    * @param quantity inputs an int through scanner
    * @param price inputs a double price through canner
    * @return pPrice or the product price for the individual
    */    
    public static double printProduct(
         String code, int quantity, double price) { 
        
        // Calculate how many batches of dozens and their remainders are
        int dozen = quantity / 12;
        int extra = quantity % 12;
        
        // Calculate the product price for the entire quantity after 
        // implementation of the discount
        double pPrice = (((quantity - extra) * QUANTITY_RATIO 
            + extra) * price) / quantity;
        
        /** 
        * Print out the product code to 7 character spaces in the string, .
        * batches up to 5 real number places, remainder to 5 real number  
        * places, and price per product
        */ 
        System.out.printf("%7s\t%5d\t%5d\t$%.2f\n", code, dozen, extra, pPrice);
        
        // Return the product price of the purchase
        return pPrice;
    }
      
}
