/**
 * WordClue has all the information for clues.
 * 
 * @author JIM ZIELEMAN
 * @version 11/30/2018
 */
public class WordClue {
    
    private final int minwordlength = 4;
    
    private final int maxcluelength = 40;
   
    private String word;
   
    private String clue;
   
    private Slice[] slice;
    
    /**
     * Constructor for objects of WordClue.
     * @param word our word that is passed
     * @param clue our clue that is passed
     */
    public WordClue(String word, String clue) {
        if (word == null || word.length() < minwordlength) {
            this.word = "DEFAULT";
        } else {
            this.word = word;
        }
        if (clue == null || clue.length() > maxcluelength 
            || clue.length() == 0) {
            this.clue = "DEFAULT CLUE";
        } else {
            this.clue = clue;
        }
        this.slice = WordUtilities.slice(this.word);
    }
    
    /**
     * equals checks if our word is equal to other.
     * @param other the other word we compare
     * @return boolean if the word is equal
     */     
    public boolean equals(WordClue other) {
        if (this.word.toUpperCase().equals(other.getWord().toUpperCase())) {
            return true;
        }
        return false;
    }
    
    /**
     * getClue gets our parts of words.
     * @return String returns clue as a string
     */     
    public String getClue() {
        return this.clue;
    }
   
    /**
     * getFirstSliceHint gets our first part of the word.
     * @return Slice our part of the word
     */     
    public Slice getFirstSliceHint() {
        Slice[] splitSlice = WordUtilities.slice(this.word);
        return splitSlice[0];
    }
    
    /**
     * getSlices gets our parts of words.
     * @return Slice[] our sliced array
     */     
    public Slice[] getSlices() {
        return this.slice;
    }

    /**
     * getWholeWordHint gets our entire word.
     * @return String our word
     */     
    public String getWholeWordHint() {
        return this.word.toUpperCase();
    }
    
    /**
     * getFirstLetterHint our first letter as a hint.
     * @return String our first letter
     */ 
    public String getFirstLetterHint() {
        String firstLetter = this.word.substring(0, 1).toUpperCase();
        return firstLetter;
    }

    /**
     * getWord gets our word.
     * @return String our word
     */ 
    public String getWord() {
        return this.word;
    }
    
    /**
     * toString turns our array into a bunch of words.
     * @param verbose our true false
     * @return String our entire printout
     */ 
    public String toString(boolean verbose) {
        String nLine = " ";
        if (!verbose) {
            return this.word + "-" + this.clue + "\n";
        } else {
            nLine = this.word + "-" + this.clue + "\n";
            for (int i = 0; i < this.slice.length; i++) {
                nLine += slice[i];
                if (i < this.slice.length - 1) {
                    nLine += " ";
                }
            }
        }
        return nLine + "\n";
    }
    
    /**
     * toString for non filled in things we give it a value.
     * so that we can run the verbose method.
     * @return String from our verbose method
     */ 
    public String toString() {
        return toString(true);
    }
}

