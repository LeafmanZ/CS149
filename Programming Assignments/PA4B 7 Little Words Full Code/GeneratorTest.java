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
     * wordSplicer method test.
     */
    @Test public void testWordSplicer() {       
   
        /** A test for wordSplicer. **/        
        Assert.assertArrayEquals("Error in test1: wordSplicer",
                 new String[] {"tof", "utti", "magn", "etism",
                     "edi", "fice", "gri", "nder", "groun", "dling",
                     "thes", "aurus", "bu", "ll"},
                 Generator.wordSplicer(
                 new String[] {"tofutti", "magnetism",
                     "edifice", "grinder", "groundling",
                     "thesaurus", "bull"}));
        /** A test for null. **/
        Assert.assertArrayEquals("Error in test1: wordSplicer", null,
                Generator.wordSplicer(new String[0]));
                
    }
    
    /** 
     * Randomizer method test.
     */    
    @Test public void testRandomizer() { 
        
        /** A test for randomizer. **/                 
        Assert.assertArrayEquals("Error in test1: randomizer",
                 new String[] {"dling", "aurus", "edi", "tof",
                     "fice", "gri", "magn", "ll", "bu", "utti",
                     "nder", "etism", "groun", "thes"},
                     Generator.randomizer(
                     new String[] {"tof", "utti", "magn", "etism",
                         "edi", "fice", "gri", "nder", "groun", "dling",
                         "thes", "aurus", "bu", "ll"}, 0));
        /** A test for null. **/
        Assert.assertArrayEquals("Error in test1: randomizer", null,
                     Generator.randomizer(new String[0], 0));
    }
    
    /** 
     * clueToString method test.
     */    
    @Test public void testClueToString() {       
       
        /** A test for clueToString. **/
        Assert.assertEquals("Error in test1: clueToString",
                  "1) a small bird\n2) common flavor\n",
                  Generator.clueToString(new String[] {"a small bird",
                      "common flavor"}));
        String[] array = new String[0]; 
        Assert.assertEquals("Error in test1: clueToString", "",
            Generator.clueToString(array));
    }
    
    /** 
     * boardToString method test.
     */    
    @Test public void testBoardToString() {
    
        /** Make an array of strings to test. **/    
        String[] board = new String[] {"tof", "utti"}; 
        
        /** A test for boardToString. **/
        String actualBoard = Generator.boardToString(board);
        Assert.assertEquals("Error in test1: boardToString",
            "------------\n| 01 | tof |\n------------\n-------------\n"
            + "| 02 | utti |\n-------------\n", actualBoard);
        /** A test for null. **/
        Assert.assertEquals("Error in test1: boardToString", null,
            Generator.boardToString(new String[0]));
    }
}
