import java.awt.Color;

public class Course {

    public  static final int FALL   = 0;
    public  static final int SPRING = 1;
    public  static final int SUMMER = 2;
    private static final int ERROR  = 3;

    private static final String[] SEMESTERS = {"Fa", "Sp", "Su", "??"};
	
    private Color   canvasColor;
    private int     number, semester, year;
    private String  department;


    public Course(String department, int number, 
                  int semester, int year, Color canvasColor) {
		
        this.department = new String(department);
        this.number = number;
        this.semester = ERROR;
        if ((semester >= FALL) && (semester <= SUMMER)) {
             this.semester = semester;
        }
		
        this.year = year;
	this.canvasColor = new Color(canvasColor.getRed(), 
                                     canvasColor.getGreen(), 
                                     canvasColor.getBlue());
    }
    
    public boolean duplicates(Course other) {
        
        if (this.getDepartment().equals(other.getDepartment()) && this.getNumber() == other.getNumber()) {
           return true;
        }
        return false;
    }
	
    public String getDepartment() {
        return department;
    }
	
    public int getNumber() {
         return number;
    }
	
    public String getTerm() {
        return String.format("%2s%2d", SEMESTERS[semester], year%100);
    }
}