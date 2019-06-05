/**
 * Lab04: Two meanings of +.
 * This program experiments with the + operator.
 *
 * @author Jim Zieleman
 * @version 09/06/18
 */
public class Concat {
    
    /**
     * I learned how to concatenate a string by using the + operator.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String sample;
        sample = "Wow\\neat\n";
        System.out.print(sample.length() + ": " + sample);
        System.out.println("This is a long string that is the "
                               + "concatenation of two shorter strings.");
        System.out.println("The first computer was invented about" + 55
                               + "years ago.");
        System.out.println("8 plus 5 is " + 8 + 5);
        System.out.println("8 plus 5 is " + (8 + 5));
        System.out.println(8 + 5 + " equals 8 plus 5.");
    }
    
}
