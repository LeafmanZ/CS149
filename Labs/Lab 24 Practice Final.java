/**
 * 
 * We are making a program that generates courses and workload.
 * @author JIM ZIELEMAN
 * @version 12/10/2018
 *
 */
public class Course {
    
    private String prefix;
    
    private int number;
    
    /**
     * This is the explicit constructor for courses.
     * 
     * @param prefix we have a prefix
     * @param number we have a number
     */
    public Course(String prefix, int number) {
        
        if (prefix == null || prefix.equals("")) {
            this.prefix = "";
        } else {
        this.prefix = prefix.toUpperCase();
        }
        
        if (number > 999 || number <= 0) {
            this.number = 000;
        } else {
            this.number = number;
        }
    }
    
    /**
     * We see if the course equals another course.
     * 
     * @param obj our object or other course we are comparing
     * @return boolean if we have equivalent courses
     */
    public boolean equals(Object obj) {
       Course cast = (Course) obj;
        if ( this.number == 0 || cast.number == 0 || !this.prefix.equals(cast.prefix) || this.number != cast.number) {
            return false;
        }
        return true;
    }
    
    /**
     * We are returning a string.
     * 
     * @return String our string
     */
    public String toString() {
        
        return String.format("%s %03d", this.prefix, this.number);
    }
    
    /**
     * We are seeing what our workload is.
     * 
     * @param schedule our passed array
     * @return int our workload
     */
    public static int workload(Course[] schedule) {
    
        int workload = 0;
        
        if (schedule == null || schedule.length == 0) {
            return -1;
        }
        
        for (int i = 0; i < schedule.length; i++) {
            
            if (schedule[i].number < 300) {
                workload += 2;
            } else if (schedule[i].number < 500) {
                workload += 3;
            } else {
                workload +=4;
            }
            
            if (schedule[i].prefix.toUpperCase().equals("CS") || schedule[i].prefix.toUpperCase().equals("MATH") ) {
                workload++;
            }
        }
        
        return workload;
    }
}
