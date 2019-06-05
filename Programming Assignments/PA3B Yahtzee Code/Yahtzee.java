/**
* Computes the scores for Yahtzee, a dice game by Milton Bradley.
*
* @author JIM ZIELEMAN
* @version 10/12/2018
*/
public class Yahtzee {
    
    public static final int ONES = 1;
    
    public static final int TWOS = 2;
    
    public static final int THREES = 3;
    
    public static final int FOURS = 4;
    
    public static final int FIVES = 5;
    
    public static final int SIXES = 6;
    
    public static final int THREE_OF_A_KIND = 9;
    
    public static final int FOUR_OF_A_KIND = 10;
    
    public static final int FULL_HOUSE = 11;
    
    public static final int SMALL_STRAIGHT = 12;
    
    public static final int LARGE_STRAIGHT = 13;
    
    public static final int YAHTZEE = 14;
    
    public static final int CHANCE = 15;
    
    /**
    * Calculates the score for a given turn.
    *
    * @param category selected by the player
    * @param dice current values of the dice
    * @return number of points, or 0 if N/A
    */
    public static int calculateScore(int category, Dice dice) {
        
        int score = 0;
        
        // Write a decision statement to evaluate the score for each category.
        // Cases that require more than several lines of code should be done
        // in separate methods below. Each case should set the value of the
        // score variable, so that you will have only one return statement.
        
        if (category == ONES) {
            score = Yahtzee.isOnes(dice);
        } else if (category == TWOS) {
            score = Yahtzee.isTwos(dice);
        } else if (category == THREES) {
            score = Yahtzee.isThrees(dice);
        } else if (category == FOURS) {
            score = Yahtzee.isFours(dice);
        } else if (category == FIVES) {
            score = Yahtzee.isFives(dice);
        } else if (category == SIXES) {
            score = Yahtzee.isSixes(dice);
        } else if (category == THREE_OF_A_KIND) {
            score = Yahtzee.isThreeOfAKind(dice);
        } else if (category == FOUR_OF_A_KIND) {
            score = Yahtzee.isFourOfAKind(dice);
        } else if (category == FULL_HOUSE) {
            score = Yahtzee.isFullHouse(dice);
        } else if (category == SMALL_STRAIGHT) {
            score = Yahtzee.isSmallStraight(dice);
        } else if (category == LARGE_STRAIGHT) {
            score = Yahtzee.isLargeStraight(dice);
        } else if (category == YAHTZEE) {
            score = Yahtzee.isYahtzee(dice);
        } else if (category == CHANCE) {
            score = Yahtzee.isChance(dice);
        }
        
        
        return score;
    }
    
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isOnes(Dice dice) {
        
        int score = 0;
        
        int ones = dice.countValues(1);
        score = ones * 1;
        
        return score;
    }
     
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isTwos(Dice dice) {
        
        int score = 0;
        
        int twos = dice.countValues(2);
        score = twos * 2;
        
        return score;
    }
     
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isThrees(Dice dice) {
        
        int score = 0;
        
        int threes = dice.countValues(3);
        score = threes * 3;
        
        return score;
    }
     
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isFours(Dice dice) {
        
        int score = 0;
        
        int fours = dice.countValues(4);
        score = fours * 4;
        
        return score;
    }
     
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isFives(Dice dice) {
        
        int score = 0;
        
        int fives = dice.countValues(5);
        score = fives * 5;
        
        return score;
    }
     
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isSixes(Dice dice) {
        
        int score = 0;
        
        int sixes = dice.countValues(6);
        score = sixes * 6;
        
        return score;
    }
    
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isThreeOfAKind(Dice dice) {
        
        int score = 0;
        
        int ones = dice.countValues(1);
        int twos = dice.countValues(2);
        int threes = dice.countValues(3);
        int fours = dice.countValues(4);
        int fives = dice.countValues(5);
        int sixes = dice.countValues(6);
        
        if (ones >= 3 || twos >= 3 || threes >= 3 
            || fours >= 3 || fives >= 3 || sixes >= 3) {
            score = dice.addValues();
        } 
        return score;       
    }
     
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isFourOfAKind(Dice dice) {
        
        int score = 0;
               
        int ones = dice.countValues(1);
        int twos = dice.countValues(2);
        int threes = dice.countValues(3);
        int fours = dice.countValues(4);
        int fives = dice.countValues(5);
        int sixes = dice.countValues(6);
        
        if (ones >= 4 || twos >= 4 || threes >= 4 
            || fours >= 4 || fives >= 4 || sixes >= 4) {
            score = dice.addValues();
        }
        
        return score;        
    }
     
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isFullHouse(Dice dice) {
       
        int score = 0;
             
        int ones = dice.countValues(1);
        int twos = dice.countValues(2);
        int threes = dice.countValues(3);
        int fours = dice.countValues(4);
        int fives = dice.countValues(5);
        int sixes = dice.countValues(6);
        
        if (ones == 3 || twos == 3 || threes == 3 
            || fours == 3 || fives == 3 || sixes == 3) {
            if ((ones == 3) && (twos == 2 || threes == 2 
                || fours == 2 || fives == 2 || sixes == 2)) {
                score = 25;
            }
            if ((twos == 3) && (ones == 2 || threes == 2 
                || fours == 2 || fives == 2 || sixes == 2)) {
                score = 25;
            }
            if ((threes == 3) && (twos == 2 || ones == 2 
                || fours == 2 || fives == 2 || sixes == 2)) {
                score = 25;
            }
            if ((fours == 3) && (twos == 2 || threes == 2 
                || ones == 2 || fives == 2 || sixes == 2)) {
                score = 25;
            }
            if ((fives == 3) && (twos == 2 || threes == 2 
                || fours == 2 || ones == 2 || sixes == 2)) {
                score = 25;
            }
            if ((sixes == 3) && (twos == 2 || threes == 2 
                || fours == 2 || fives == 2 || ones == 2)) {
                score = 25;
            }
        }
        return score;
    }
     
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isSmallStraight(Dice dice) {
        
        int score = 0;
        
        int ones = dice.countValues(1);
        int twos = dice.countValues(2);
        int threes = dice.countValues(3);
        int fours = dice.countValues(4);
        int fives = dice.countValues(5);
        int sixes = dice.countValues(6);
        
        if (ones >= 1 && twos >= 1 && threes >= 1 && fours >= 1) {
            score = 30;
        }
        if (twos >= 1 && threes >= 1 && fours >= 1 && fives >= 1) {
            score = 30;
        }
        if (threes >= 1 && fours >= 1 && fives >= 1 && sixes >= 1) {
            score = 30;
        }
        
        return score;
    }
     
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isLargeStraight(Dice dice) { 
     
        int score = 0;
        
        int ones = dice.countValues(1);
        int twos = dice.countValues(2);
        int threes = dice.countValues(3);
        int fours = dice.countValues(4);
        int fives = dice.countValues(5);
        int sixes = dice.countValues(6);
        
        if (ones == 1 && twos == 1 && threes == 1 && fours == 1 && fives == 1) {
            score = 40;
        }
        if (twos == 1 && threes == 1 && fours == 1 
            && fives == 1 && sixes == 1) {
            score = 40;
        }
        
        return score;
    }
     
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isYahtzee(Dice dice) {
     
        int score = 0;
     
        int ones = dice.countValues(1);
        int twos = dice.countValues(2);
        int threes = dice.countValues(3);
        int fours = dice.countValues(4);
        int fives = dice.countValues(5);
        int sixes = dice.countValues(6); 
        
        if (ones == 5 || twos == 5 || threes == 5 
            || fours == 5 || fives == 5 || sixes == 5) {
            score = 50;
        }
        
        return score;
    }
     
    /**
    * Calculates the score for a given turn.
    *
    * @param dice current values of the dice
    * @return score
    */
    public static int isChance(Dice dice) {
        
        int score;
        
        score = dice.addValues();
        
        return score;  
    }
}

