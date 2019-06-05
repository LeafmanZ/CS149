/**
 * Numble is a number scoring game.
 *
 *@author Jim Zieleman
 *@version 11/1/2018
 **/
public class Numble {
    
    public static final int NONE = 1;
    
    public static final int DOUBLE_TOTAL = 2;
    
    public static final int TRIPLE_TOTAL = 3;
    
    public static final int DOUBLE_INDEX = 4;
    
    public static final int TRIPLE_INDEX = 5;
    
    /**
     * calculateScore for the array.
     *
     *@param points is an array given
     *@param bonusType is the multiplier for the points
     *@param bonusIndex is the location of where you will multiply
     *@return totalScore we get after calculation
     **/
    public static int calculateScore(
        int[] points, int bonusType, int bonusIndex) {
        
        int bonusT = bonusType;
        int bonusI = bonusIndex;
        
        int totalScore = 0;
        if (points == null) {
            bonusT = 4;
            bonusI = -10;
        }
        if (bonusType <= 0) {
            totalScore = bonusType;
        } else if (bonusType < 4 && bonusType > 0) {
            for (int i = 0; i < points.length; i++) {
                totalScore += points[i];
            }
            totalScore = totalScore * bonusType;
        } else {
            if (bonusI < 0 || bonusI >= points.length) {
                return 0;
            }
            points[bonusI] = points[bonusI] * (bonusT - 2);
            for (int i = 0; i < points.length; i++) {
                totalScore += points[i];
            }
        }
        return totalScore;
    }
}
