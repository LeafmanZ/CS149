import org.junit.Assert;
import org.junit.Test;

/**
* We do coding in JAVA. We are testing lab 8.
*
* @author Jim Zieleman
* @version 09/22/2018
* Acknowledgements: I received no outside help on this assignment and have 
* abided by the JMU Honor Code.
*/
public class BasicMathTest {

    /** 
    * Main test.
    */
    @Test public void testBasicMath() {
        new BasicMath();
    }

    /**
    * Tests inputs and does a math operation.
    *
    */  
    @Test public void testAdd() {
        double expected;
        double actual;
      
        expected = 15.5;
        actual = BasicMath.add(7.2, 8.3);
        Assert.assertEquals(expected, actual, .00001);
      
        expected = 0.0;
        actual = BasicMath.add(0.0, 0.0);
        Assert.assertEquals(expected, actual, .00001);
      
        expected = -1.5;
        actual = BasicMath.add(-5.0, 3.5);
        Assert.assertEquals(expected, actual, .00001);
    }
    
    /**
    * Tests inputs and does a math operation.
    *
    */  
    @Test public void testSubtract() {
        double expected;
        double actual;
         
        expected = 2.2;
        actual = BasicMath.subtract(3.5, 1.3);
        Assert.assertEquals(expected, actual, .00001);
          
        expected = 2.5;
        actual = BasicMath.subtract(3.5, 1.0);
        Assert.assertEquals(expected, actual, .00001);
         
        expected = 2.0;
        actual = BasicMath.subtract(3.3, 1.3);
        Assert.assertEquals(expected, actual, .00001);
    }
    
    /**
    * Tests inputs and does a math operation.
    *
    */
    @Test public void testMultiply() {
        double expected;
        double actual;
         
        expected = 4.55;
        actual = BasicMath.multiply(3.5, 1.3);
        Assert.assertEquals(expected, actual, .00001);
         
        expected = -3.5;
        actual = BasicMath.multiply(3.5, -1.0);
        Assert.assertEquals(expected, actual, .00001);
         
        expected = -4.55;
        actual = BasicMath.multiply(3.5, -1.3);
        Assert.assertEquals(expected, actual, .00001);
    }
   
    /**
    * Tests inputs and does a math operation.
    *
    */
    @Test public void testDivide() {
        double expected;
        double actual;
        
        expected = 1.94;
        actual = BasicMath.divide(3.88, 2.0);
        Assert.assertEquals(expected, actual, .00001);
         
        expected = -1.94;
        actual = BasicMath.divide(3.88, -2.0);
        Assert.assertEquals(expected, actual, .00001);
         
        expected = 2.5;
        actual = BasicMath.divide(5.0, 2.0);
        Assert.assertEquals(expected, actual, .00001);
    }
     
}

