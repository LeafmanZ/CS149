import org.junit.Assert;
import org.junit.Test;

/**
 * PA4: Generator Test.
 *
 * @author JIM ZIELEMAN
 * @version 10/19/2018
 */
public class GeneratorTest {

    /** 
     * Generator generator test.
     */
    @Test public void generatorTest() {
        new Generator();
    }

    /** 
     * Generator class test.
     */
    @Test public void testGenerator() {
     
        /** Make an array of strings to test. **/    
        String[] board = new String[] {"tofutti", "magnetism"};        
   
        /** A test for wordSplicer. **/        
        Assert.assertArrayEquals("Error in test1: wordSplicer",
                 new String[] {"tof", "utti", "magn", "etism"},
                 Generator.wordSplicer(
                 new String[] {"tofutti", "magnetism"}));        
        /** A test for randomizer. **/                 
        Assert.assertArrayEquals("Error in test1: randomizer",
                 new String[] {"dling", "aurus", "edi", "tof",
                     "fice", "gri", "magn", "ll", "bu", "utti",
                     "nder", "etism", "groun", "thes"},
                     Generator.randomizer(
                     new String[] {"tof", "utti", "magn", "etism",
                         "edi", "fice", "gri", "nder", "groun", "dling",
                         "thes", "aurus", "bu", "ll"}, 0));
        /** A test for clueToString. **/
        Assert.assertEquals("Error in test1: clueToString",
                  "1) a small bird\n2) common flavor\n",
                  Generator.clueToString(new String[] {"a small bird",
                      "common flavor"}));
        /** A test for boardToString. **/
        String actualBoard = Generator.boardToString(board);
        Assert.assertEquals("Error in test1: boardToString",
            "------------\n| 01 | tof |\n------------\n-------------\n"
            + "| 02 | utti |\n-------------\n",
            actualBoard);
    }
}
