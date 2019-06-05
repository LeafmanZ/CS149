/**
 * Create an array set.
 * Then modify them.
 * 
 * @author JIM ZIELEMAN
 * @version 10/16/2018
 */
public class ArrayPlay {

    /**
    * Main Method.
    *@param args not used.
    */    
    public static void main(String[] args) {

        // PART 1
        // Create array size 6
        int[] array;
        array = new int[6];
        // Make array values -1
        for (int i = 0; i < array.length; i++) {
            
            array[i] = -1;
        }
        // Call print array method
        printArray(array);
        // make array values their position
        for (int i = 0; i < array.length; i++) {
        
            array[i] = i;
        }
        // Call print array method
        printArray(array);
        // Reset array values to 0
        array = new int[6];
        
        // PART 2\
        // Create die object
        Die d;
        d = new Die();
        
        // Create title string statement for print method
        String statement = "";
        // Create our counting array to count die values
        int[] count = new int[6];
        // Create array to hold die values
        int[] die1 = new int[100];
        // Place holder variable to hold array values
        int dieNum = 0;
        // Generate random numbers for all values of the array      
        for (int i = 0; i < die1.length; i++) {
        
            die1[i] = d.roll();
        }
        
        // We find the value of die1 at the current position.
        // We increment the count array value for the position.
        for (int i = 0; i < die1.length; i++) { 
           
            dieNum = die1[i];
            count[die1[i] - 1] += 1;   
        }
        // Call print method
        printCount(count);
        
        // PART 3
        // Create two size 10 arrays
        double[] list = new double[10];
        double[] other = new double[10];
        // Generate array list values as their position
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        // Give the title
        statement = "Before";
        // Call print method
        printList(list, other, statement);
        
        // Create place holder value for the arrays as we clone arrays
        double changeNum;
        // Generate values for array other as a copy of array list
        for (int i = 0; i < list.length; i++) {
            
            changeNum = list[i];
            other[i] = changeNum;
        }
        // Give the title
        statement = "After";
        // Call print method
        printList(list, other, statement);
        
        // Give list and other values 99.0 for the respective positions 0, 5
        list[0] = 99.0;
        other[5] = 99.0;
        // Give the title
        statement = "After Change";
        // Call print method
        printList(list, other, statement);
    }  
    
    /**
    * Print method for part 1.
    *@param array from part 1
    */    
    public static void printArray(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    
    /**
    * Print method for part 2.
    *@param count from main to print.
    */    
    public static void printCount(int[] count) {
        
        System.out.println("Array Play");
        for (int i = 0; i < count.length; i++) {
        
            System.out.println(
                (i + 1) + " was rolled " + count[i] + " times.\n");
        }
    }
    
    /**
    * Print method for part 3.
    *@param list from main to print.
    *@param other from main to print
    *@param statement title
    */    
    public static void printList(double[] list, double[] other, 
        String statement) {
        
        System.out.println(statement);
        for (int i = 0; i < list.length; i++) {
       
            System.out.println(i + " A1 = " + list[i] + " A2 = " + other[i]);
        }
    }           
}
