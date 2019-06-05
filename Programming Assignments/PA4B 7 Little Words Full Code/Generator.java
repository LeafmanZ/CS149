import java.util.Random;

/**
 * PA4: Generator.
 *
 * @author JIM ZIELEMAN
 * @version 10/19/2018
 */
public class Generator {

    /**
     * randomizer method randomizes our spliced word array.
     * @param board our array that needs to be randomized
     * @param seed our picked number to randomize the array
     * @return scramble our randomized array from wordSplicer
     */
    public static String[] randomizer(String[] board, int seed) {
        
        // new board copy to modify
        String[] newBoard = board;
        // we make a variable for a newspot we randomly generate for 
        // the new array 
        int newSpot = 0;
        // we check if board or the spliced array make sense
        // if not we return null OR length < 2
        if (newBoard == null || newBoard.length < 2) {
            return null;
        }
        // instant of random object
        Random randomized = new Random(seed);
        
        // create forloop to scramble the spliced array
        for (int i = 0; i < newBoard.length; i++) {
            // instantiate randomIndex to place our random array points
            int randomIndex;
            // set the randomIndex value
            randomIndex = (int) (randomized.nextDouble() * newBoard.length);
            // calls the swap class
            swap(i, randomIndex, newBoard);
        }
        
        // return the scrambled array
        return board;
       
        /** Old
        // for the first submission
        // create an array of strings for our expected output for the test
        String[] randomized = new String[] {"dling", "aurus", "edi", "tof",
            "fice", "gri", "magn", "ll", "bu", "utti",
            "nder", "etism", "groun", "thes"};
        // return expected output            
        return randomized;
        */      
    }
    
    /**
     * Randomize the initial array from board by changing the index.
     *
     * @param i is the position of our board
     * @param randomIndex the random position of our board
     * @param board is the array we get passed from randomizer
     */
    public static void swap(int i, int randomIndex, String[] board) {
        // initialize a string for where the randomized array  by taking 
        // the value from the board at the index
        String randBoard = board[i];
        // set board at the index to the value of the board at the random index
        board[i] = board[randomIndex];
        // board at that index is going to be set to the value of 
        // the old index value
        board[randomIndex] = randBoard;
    }
    
    /**
     * clueToString method gives us a clue to our solution.
     * @param clues is an array of clues
     * @return clue which is a string from the array
     */
    public static String clueToString(String[] clues) {
        
        // create a String to return a clue
        String clue = "";
        // check if the array clues is null and if so return ""        
        if (clues == null || clues.length < 1) {
            return "";
        }        
        // create variable to number the clues
        int j = 1;
        // forloop through clues so that we can build a string to return
        for (int i = 0; i < clues.length; i++) {

            // we add i
            clue += j + ") " + clues[i] + "\n";
            // increment j
            j++;
        }
        
        // return the clue statement
        return clue;
        
        
        // for the first submission
        // create a string for our expected output for the test        
    }
    
    /**
     * wordSplicer method where we get an array of strings and cut them in half.
     * @param solutions is the set of answers
     * @return splice of our strings
     */     
    public static String[] wordSplicer(String[] solutions) {
        
        // check solution size
        if (solutions == null || solutions.length < 1) {
            
            // return null if solution size is 0
            return null;
        }    
        // we create an array of strings variable to return after splicing
        String[] splice = new String[solutions.length * 2];
        // we create a string to hold the value of solutions
        String solVal = "";
        // initialize j outside of the loop so that it does not get reset
        int j = 0;
        // we create a loop for solutions
        for (int i = 0; i < solutions.length; i++) {
            
            // we assign the value of solutions at i to a string
            solVal = solutions[i];
            // we utilize the loop to place values into our splice array
            // we take each entry and splice them and assign their value 
            // to j
            splice[j] = solVal.substring(
                0, solVal.length() / 2);
            splice[j + 1] = solVal.substring(
                solVal.length() / 2, solVal.length());
            // we increment by 2 since we add j and j + 1 entries
            j += 2; 
        }
        // return spliced array
        return splice;
     
        /**
        // for the first submission
        // create an array of strings for our expected output for the test
        String[] spliced = new String[] {"tof", "utti", "magn", "etism"};
        // return expected output
        return spliced;
        */
    }
    
    /**
     * clueToString method gives us a clue to our solution.
     * @param board is an array returned from wordSplicer
     * @return clue which is a string from the array
     */    
    public static String boardToString(String[] board) {
        // create the string we will be adding on to to return
        String format = "";
        // we check if the board length makes anysense
        if (board == null || board.length < 1) {
            return null;
        }
        String word = "";
        for (int i = 0; i < board.length; i++) {
            word = board[i];
            format += "---------";
            for (int j = word.length(); j > 0; j--) {
                format += "-";
            }
            if (i < 9) {
                // we add a new line plus a buncha extra stuff
                // we have 0 in this string because the position is single digit
                // adding a 0 will keep the format correct
                format += "\n| 0" + (i + 1) + " | " + word + " |\n";
            } else {
                // we do not add a 0 for double digits
                format += "\n| " + (i + 1) + " | " + word + " |\n";
            }
            format += "---------";
            // add dashes for the extra letters needed to keep the format
            for (int j = word.length(); j > 0; j--) {
                format += "-";
            }
            // add a new line for the next word
            format += "\n";
        }    
        /**
        // we chop the board using the splicer method
        String[] boardSpliced = wordSplicer(board);
        // we set a variable to hold the spliced array value
        String spliceWord = "";
        // we grab the splicedWord at the array from beginning to end
        for (int i = 0; i < boardSpliced.length; i++) {
            spliceWord = boardSpliced[i];
            // we add on part of the dashes
            format += "---------";
            // we add on a dash for every extra letter we have in the word
      
            for (int j = spliceWord.length(); j > 0; j--) {
                format += "-";
            }
            // we check the position of the array
            // if it is under 9 the position is 1 - 9 
            if (i < 9) {
                // we add a new line plus a buncha extra stuff
                // we have 0 in this string because the position is single digit
                // adding a 0 will keep the format correct
                format += "\n| 0" + (i + 1) + " | " + spliceWord + " |\n";
            } else {
                // we do not add a 0 for double digits
                format += "\n| " + (i + 1) + " | " + spliceWord + " |\n";
            }
            // do as same above where the core dash set is added
            format += "---------";
            // add dashes for the extra letters needed to keep the format
            for (int j = spliceWord.length(); j > 0; j--) {
                format += "-";
            }
            // add a new line for the next word
            format += "\n";            
        }
        **/
        // return the string that holds all of our formatted spliced words
        return format;
    }
}
