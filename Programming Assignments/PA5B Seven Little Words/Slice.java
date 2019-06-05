/**
 * Slice checks our usage on splitted text.
 * 
 * @author JIM ZIELEMAN
 * @version 11/30/2018
 */
public class Slice {
    
    private boolean used;
    
    private String text;
    
    /**
     * Constructor for objects of Slice.
     * @param text our word that is passed
     */
    public Slice(String text) {
        this.text = text;
    }
    
    /**
     * isUsed checks if word is used.
     * @return boolean if used or not
     */  
    public boolean isUsed() {
        if (used) {
            return true;
        }
        
        return false;
    }
        
    /**
     * reset puts used to default value.
     */ 
    public void reset() {
        this.used = false;
    }
      
    /**
     * toString returns text as string.
     * @return String is our returned text
     */ 
    public String toString() {
        if (!used) {
            return this.text;
        }
        
        return "";
    }
        
    /**
     * use puts text in used value.
     */ 
    public void use() {
        this.used = true;
    }
}
