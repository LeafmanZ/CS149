import java.util.Scanner;

/**
* We have a program that finds runner times.
* @author Jim Zieleman
*
* @version 9/27/18
*/
public class PaceCalculator {

    /**
    * We are running the program.
    * 
    * @param args we have an arguement
    */
    public static void main(String[] args) {
        
        // Add marathon distance
        final double MARATHON = 26.219;
        
        // We initialize scanner
        Scanner in = new Scanner(System.in);
    
        // Start prompts
        System.out.print("Enter the number of minutes run: ");
        int minutes = in.nextInt();
    
        System.out.print("Enter the number of seconds run: ");
        double seconds = in.nextDouble();
        in.nextLine();
    
        System.out.print("Enter your name: ");
        String name = in.nextLine();
    
        System.out.print("Enter the number of miles run: ");
        double miles = in.nextDouble();
        
        // Calculation
        double doubleMin = (double) minutes;
        double totalMin = doubleMin + (seconds / 60);
        double pace = totalMin / miles;
        int paceMin = (int) pace;
        double paceSec = (pace - paceMin) * 60;
        double maraTime = pace * MARATHON;
        int maraTimeH = (int) (maraTime / 60);
        double maraTimeM = maraTime % 60;
        
        // Print output
        System.out.println("Congratulations " + name + "!");
        System.out.printf("Your total time was %2.2f minutes\n", totalMin);
        System.out.print("Your pace was: " + paceMin + " minutes and "); 
        System.out.printf("%.2f seconds per mile\n", paceSec);
        System.out.printf(
            "If you ran a marathon at that pace you would finish in: %d hours ",
            maraTimeH);
        System.out.printf("%.2f minutes", maraTimeM);
            
    }
} 
