import org.junit.Assert;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

/**
 * CSCardTest.
 * @author Alvin Chao
 * @version 2-13-18
 * Acknowlegements: 
 */

public class CSCardTest {

    /** A test that always fails. **/
    @Test public void testCSCard() {
      
    }
   
    /**
     * Tests the calculateInterest method.
     */
    @Test public void testCalculateInterest() {
        double actual;
        
        actual = CSCard.calculateInterest(0, 125.25);
        Assert.assertEquals("Error in calculateInterest: ", 0.00, actual, .01);
        
        actual = CSCard.calculateInterest(50, 50);
        Assert.assertEquals("Error in calculateInterest: ",
            2.00, actual, .01);       
    }
    
    /**
     * Tests the calculateMinPayment method.
     */
    @Test public void testCalculateMinPayment() {
        double actual;
        
        actual = CSCard.calculateMinPayment(-1.00);
        Assert.assertEquals("Error in calculateMinPayment: ",  
                0.00, actual, .01);
        
        actual = CSCard.calculateMinPayment(38.00);
        Assert.assertEquals("Error in calculateMinPayment: ", 
                38.00, actual, .01);
        
        actual = CSCard.calculateMinPayment(128.00);
        Assert.assertEquals("Error in calculateMinPayment: ", 
                50.00, actual, .01);
        
        actual = CSCard.calculateMinPayment(350.00);
        Assert.assertEquals("Error in calculateMinPayment: ", 
                70.00, actual, .01);
    } 
    
  
    /**
     * Tests the main method.
     */
    @Test public  void testMain() {
        new CSCard(); // cover the class line
        simulateMain("50\n50\n");
        simulateMain("BAD\n50\n");
        simulateMain("50\nBAD\n");
    }  

    /**
     * Run CSCard.main as if the user had typed in the given input.
     *
     * @param input the input to simulate
     */
    private static void simulateMain(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        CSCard.main(new String[] {});
    }   
}
