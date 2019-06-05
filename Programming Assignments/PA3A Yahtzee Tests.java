import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for PA3: Yahtzee Scores (Decisions and Logic).
 *
 * @author JIM ZIELEMAN
 * @version 10/5/2018
 */
public class YahtzeeTest {
    

    /** 
     * Yahtzee Class test.
     */
    @Test public void testYahtzee() {
        new Yahtzee();
    }
     
    /**
     * Example test cases from the assignment handout & completed test cases.
     */  
    @Test public void testcalculateScore() {
        Dice dice;
        
        dice = new Dice(2, 2, 2, 5, 5);  // full house
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.ONES, dice));
        Assert.assertEquals(6, Yahtzee.calculateScore(Yahtzee.TWOS, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.THREES, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.FOURS, dice));
        Assert.assertEquals(10, Yahtzee.calculateScore(Yahtzee.FIVES, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.SIXES, dice));
        Assert.assertEquals(16, Yahtzee.calculateScore(Yahtzee.THREE_OF_A_KIND, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.FOUR_OF_A_KIND, dice));
        Assert.assertEquals(25, Yahtzee.calculateScore(Yahtzee.FULL_HOUSE, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.SMALL_STRAIGHT, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.LARGE_STRAIGHT, dice));
        Assert.assertEquals(16, Yahtzee.calculateScore(Yahtzee.CHANCE, dice));
        
        dice = new Dice(1, 3, 4, 5, 6);  // small straight
        Assert.assertEquals(1, Yahtzee.calculateScore(Yahtzee.ONES, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.TWOS, dice));
        Assert.assertEquals(3, Yahtzee.calculateScore(Yahtzee.THREES, dice));
        Assert.assertEquals(4, Yahtzee.calculateScore(Yahtzee.FOURS, dice));
        Assert.assertEquals(5, Yahtzee.calculateScore(Yahtzee.FIVES, dice));
        Assert.assertEquals(6, Yahtzee.calculateScore(Yahtzee.SIXES, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.THREE_OF_A_KIND, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.FOUR_OF_A_KIND, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.FULL_HOUSE, dice));
        Assert.assertEquals(30, Yahtzee.calculateScore(Yahtzee.SMALL_STRAIGHT, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.LARGE_STRAIGHT, dice));
        Assert.assertEquals(19, Yahtzee.calculateScore(Yahtzee.CHANCE, dice));
        
        dice = new Dice(1, 2, 3, 4, 5);  // large straight
        Assert.assertEquals(1, Yahtzee.calculateScore(Yahtzee.ONES, dice));
        Assert.assertEquals(2, Yahtzee.calculateScore(Yahtzee.TWOS, dice));
        Assert.assertEquals(3, Yahtzee.calculateScore(Yahtzee.THREES, dice));
        Assert.assertEquals(4, Yahtzee.calculateScore(Yahtzee.FOURS, dice));
        Assert.assertEquals(5, Yahtzee.calculateScore(Yahtzee.FIVES, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.SIXES, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.THREE_OF_A_KIND, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.FOUR_OF_A_KIND, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.FULL_HOUSE, dice));
        Assert.assertEquals(30, Yahtzee.calculateScore(Yahtzee.SMALL_STRAIGHT, dice));
        Assert.assertEquals(40, Yahtzee.calculateScore(Yahtzee.LARGE_STRAIGHT, dice));
        Assert.assertEquals(15, Yahtzee.calculateScore(Yahtzee.CHANCE, dice));
        
        dice = new Dice(6, 6, 6, 6, 6);  // yahtzee
        
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.ONES, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.TWOS, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.THREES, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.FOURS, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.FIVES, dice));
        Assert.assertEquals(30, Yahtzee.calculateScore(Yahtzee.SIXES, dice));
        Assert.assertEquals(30, Yahtzee.calculateScore(Yahtzee.THREE_OF_A_KIND, dice));
        Assert.assertEquals(30, Yahtzee.calculateScore(Yahtzee.FOUR_OF_A_KIND, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.FULL_HOUSE, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.SMALL_STRAIGHT, dice));
        Assert.assertEquals(0, Yahtzee.calculateScore(Yahtzee.LARGE_STRAIGHT, dice));
        Assert.assertEquals(50, Yahtzee.calculateScore(Yahtzee.YAHTZEE, dice));
        Assert.assertEquals(30, Yahtzee.calculateScore(Yahtzee.CHANCE, dice));
        
    }
    
}
