import java.util.Scanner;

/**
 * Compute statistical data and compute variances.
 * Lab 14.
 * 
 * @author JIM ZIELEMAN
 * @version 10/16/2018
 */
public class Main {

    /**
    * Main Method.
    *@param args not used.
    */    
    public static void main(String[] args) {
        
        int dataLength;
        if (args.length < 1) {
            dataLength = 25;
        } else {
            dataLength = Integer.parseInt(args[0]);
        }
        
        Scanner in = new Scanner(System.in);
        
        double[] data = new double[dataLength];
        for (int i = 0; i < data.length; i++) {
            data[i] = in.nextDouble();
        }
        
        double mean = Stats.mean(data);
        System.out.printf("Mean: %.2f\n", mean);
        
        double std = Stats.stdDev(data);
        System.out.printf("StdDev: %.2f\n", std);
    }
}
