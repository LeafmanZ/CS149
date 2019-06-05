/**
 * Compute statistical data and compute variances.
 * Lab 14.
 * 
 * @author JIM ZIELEMAN
 * @version 10/16/2018
 */
public class Stats {
    
    
    /**
    * Stats mean meathod.
    *@param data that we were given from main.
    *@return mean
    */    
    public static double mean(double[] data) {
        
        if (data == null) {
        
            return Double.NaN;
        }
             
        // Compute mean
        double sum = 0;
        double mean;
        
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        mean = sum / data.length;
        
        return mean;
    }
   
    /**
    * Stats mean meathod.
    *@param data that we were given from main.
    *@return mean
    */   
    public static double stdDev(double[] data) {
        
        // Compute standard deviation
        double stdSum = 0;
        double std;
        double mean = mean(data);
        for (int i = 0; i < data.length; i++) {
            stdSum += Math.pow(data[i] - mean, 2);
        }
        std = Math.pow(stdSum / data.length, .5);
        
        return std;
    }
}
