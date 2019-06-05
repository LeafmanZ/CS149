/**
 * WordUtilities has the usage of Slice for our words.
 * 
 * @author JIM ZIELEMAN
 * @version 11/30/2018
 */
public class WordUtilities {

    /**
     * slice our words.
     * @param word word sliced
     * @return Slice[] array so we get our array of the cut up word.
     */    
    public static Slice[] slice(String word) {
        
        word.toUpperCase();
        Slice[] newSlice;
        
        if ((word.length() % 3) == 0) {
            newSlice = new Slice[word.length() / 3];
            int count = 0;
            for (int i = 0; i < word.length(); i += 3) {
                newSlice[count] = new Slice(word.substring(
                    i, i + 3).toUpperCase());
                count++;
            }
        } else if ((word.length() % 2) == 0) {
            newSlice = new Slice[word.length() / 2];
            int count = 0;
            for (int i = 0; i < word.length(); i += 2) {
                newSlice[count] = new Slice(word.substring(
                    i, i + 2).toUpperCase());
                count++;
            }
        } else {
            int count = 1;
            newSlice = new Slice[word.length() / 2];
            newSlice[0] = new Slice(word.substring(0, 3).toUpperCase());
            for (int i = 3; i < word.length(); i += 2) {
                newSlice[count] = new Slice(word.substring(
                    i, i + 2).toUpperCase());
                count++;
            }
        }
        
        return newSlice;
    }
}
