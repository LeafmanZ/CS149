/**
 * GameInfo has all the information needed to access.
 * 
 * @author JIM ZIELEMAN
 * @version 11/30/2018
 */
public class GameInfo {
    
    private final int numberofwords = 7;
    
    private boolean complete;
    
    private Slice[] slice = new Slice[numberofwords];
    
    private WordClue[] cluelist = new WordClue[numberofwords];
    
    private String[] game = new String[numberofwords];
    
    /**
     * Constructor for objects of GameInfo.
     * @param filename lines in the file
     */
    public GameInfo(String filename) {
        for (int i = 0; i < numberofwords; i++) {
            this.game[i] = FileUtilities.readLinesFromFile(
                filename, numberofwords)[i];            
        }
        this.cluelist = getWordClues();
        this.slice = getSlices();
    }
    
    /**
     * getSlice gets our parts of words.
     * @return Slice[] our sliced array
     */  
    public Slice[] getSlices() {
        int sliceL = 0;
        int sliceC = 0;
        Slice[] lengC = new Slice[numberofwords];
        for (int i = 0; i < numberofwords; i++) {
            sliceL += WordUtilities.slice(this.cluelist[i].getWord()).length;
        }
        Slice[] sliceRet = new Slice[sliceL];
        for (int i = 0; i < numberofwords; i++) {
            Slice[] temp = WordUtilities.slice(cluelist[i].getWord());
            for (int j = 0; j < temp.length; j++) {
                sliceRet[sliceC] = temp[j];
                sliceC++;
            }
        }
        return sliceRet;
    }
    
    /**
     * getWordClues gets our clues for our word.
     * @return WordClue[] our clue array
     */ 
    public WordClue[] getWordClues() {
        for (int i = 0; i < numberofwords; i++) {
            cluelist[i] = new WordClue(
                game[i].substring(
                0, game[i].indexOf('-')), game[i].substring(
                game[i].indexOf('-') + 1));
        }
        return cluelist;
    }
    
    /**
     * toString gets our parts of words.
     * @return String our full list of clues and slices
     */     
    public String toString() {
        String rString;
        String temp;
        Slice[] slice = getSlices();
        rString = "Cluelist\n";
        for (int i = 0; i < numberofwords; i++) {
            rString += game[i] + "\n";
        }
        
        rString += "\nSlices\n";
        for (int i = 0; i < slice.length; i++) {
            rString += slice[i] + "\n";
        }
        return rString;
    }
    
    /**
     * isComplete checks completion of cluelist.
     * @return boolean if we are completed or not
     */ 
    public boolean isComplete() {
        if (cluelist.length == 7) {
            return true;
        }
        return false;
    }

}
