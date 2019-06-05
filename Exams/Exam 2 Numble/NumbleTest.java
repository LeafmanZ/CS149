import org.junit.Assert;
import org.junit.Test;

/**
 * NumbleTest our numble program.
 *
 *@author Jim Zieleman
 *@version 11/1/2019
 **/
public class NumbleTest {

    /** A test for the class. **/
    @Test public void testNumble() {
        new Numble();
    } 

    /** A test for NONE. **/
    @Test public void testNone() {
      
        int[] points;
        points = new int[]{1, 2, 3, 4};
        Assert.assertEquals(
            "Default None", 10, Numble.calculateScore(points, Numble.NONE, 1));
    }
    
    /** A test for DOUBLE_TOTAL. **/
    @Test public void testDoubleTotal() {
      
        int[] points;
        points = new int[]{1, 2, 3, 4};
        Assert.assertEquals(
            "Default DoubleTotal", 20, Numble.calculateScore(
                points, Numble.DOUBLE_TOTAL, -10));
    }
    
    /** A test for TRIPLE_TOTAL. **/
    @Test public void testTripleTotal() {
      
        int[] points;
        points = new int[]{1, 2, 3, 4};
        Assert.assertEquals(
            "Default TripleTotal", 30, Numble.calculateScore(
                points, Numble.TRIPLE_TOTAL, 3));
    }
    
    /** A test for DOUBLE_INDEX. **/
    @Test public void testDoubleIndex() {
      
        int[] points;
        points = new int[]{1, 2, 3, 4};
        Assert.assertEquals(
            "Default DoubleIndex", 13, Numble.calculateScore(
                points, Numble.DOUBLE_INDEX, 2));
    }
    
    /** A test for TRIPLE_INDEX. **/
    @Test public void testTripleIndex() {
      
        int[] points;
        points = new int[]{1, 2, 3, 4};
        Assert.assertEquals(
            "Default TripleIndex", 18, Numble.calculateScore(
                points, Numble.TRIPLE_INDEX, 3));
        Assert.assertEquals(
            "Default TripleIndex", -5, Numble.calculateScore(
                points, -Numble.TRIPLE_INDEX, 3));
    }
    
}
