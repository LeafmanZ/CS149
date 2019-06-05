/**
 * SevenLittleWords is our main java and checks if it can run.
 * 
 * @author JIM ZIELEMAN
 * @version 11/30/2018
 */
public class SevenLittleWords {
        
    /**
     * main checks if program will run with its given args.
     * @param args we have an arguement
     */ 
    public static void main(String[] args) {
        
        GameInfo info = new GameInfo(args[0]);
        if (args[0] == null) {
            System.out.println("File Error");
            System.exit(0);
        }
        GameBoard board = new GameBoard(info);
        
        if (board == null) {
            System.out.println("Board Error");
            System.exit(0);
        }
        board.setVisible(true);

    }

}
