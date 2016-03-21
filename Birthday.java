import java.util.Random;
import java.lang.String;  //Import String module.
import java.lang.StringBuilder; //Import StringBuilder.

/**
 * Represents the month and day of a birthday.
 * (For assignment 2)
 * 
 * If you use this class, you should say that you modified it.
 * 
 * @author Leigh Stauffer
 */
public class Birthday {
    
    /** Between 1 and 12, inclusive; 1 = January, 2 = February, etc. */
    private int month;
    
    private int day;
    
    // --------------- CONSTANTS -------------------

    // assumes February has 29 days
    private static final int[] daysInMonth = { 31, 29, 31, 30, 31, 30, 31, 31,
			30, 31, 30, 31 };

    private static final String[] MONTHS = { "January", "February", "March",
			"April", "May", "June", "July", "August", "September", "October",
			"November", "December" };

    private static final int NUM_MONTHS = MONTHS.length;

    private static Random random = new Random();

    private static final int JANUARY = 1;
    private static final int DECEMBER = 12;

    public Birthday(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public Birthday() {
        // Randomly generate the month: between 1 and 12, inclusive
        month = random.nextInt(12) + 1;

        // Picks a random day, based on the month
        day = random.nextInt(daysInMonth[month-1]) + 1;
    }
    
    public int getMonth(){
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) { 
        this.day = day;
    }
	
    //Overridden Parent (Object) methods
    public String toString(){
	StringBuilder rep = new StringBuilder("\nMonth: ");
	rep.append(MONTHS[month-1]);
	rep.append("\nDay: ");
	rep.append(day);
	return rep.toString();
    }

    public boolean equals(Object obj){
	if (this == obj){
	    return true;
	}
	if ( ! (obj instanceof Birthday)){
	    return false;
	}
	Birthday other = (Birthday) obj;
	if (other.getMonth() != this.getMonth()){
	    return false;
	}
	if (other.getDay() != this.getDay()){
	    return false;
	}
	else {
	    return true;
	}
    }
    
    /**
     * @param month : 1 is January, 2 is February, ..., 12 is December
     * @param day : must be in valid range for the month (typically 1 to 29-31) 
     * @throws IllegalArgumentException if month or day is out of the valid range
     */
    public void setBirthday( int month, int day ) {
        // check month (1 and 12) and day in range (depends on the month)
        // if not, then throw an IllegalArgumentException
        if( month < 1 || month > 12 ) {
            throw new IllegalArgumentException("Month is not in valid range (1-12)");   
        }
        
        if( day < 1 || day > daysInMonth[month-1] ) {
            throw new IllegalArgumentException("Day is not in valid range (1-" + daysInMonth[month-1] + ")");   
        }
        
        // set the values if valid
        this.month = month;
        this.day = day;
    }
    
    public static void main(String args[]) {
        System.out.println(new Birthday());
        System.out.println(new Birthday());
        
        Birthday b = new Birthday();
        b.setBirthday(2, 29);  //Change day of month so exception is not thrown.
	System.out.println("String representation of b: " + b.toString());
	Birthday mine = new Birthday(3,8);
	Birthday yours = new Birthday(8,15);
	Birthday same = new Birthday(3,8);
	Birthday alias = mine;
	System.out.println("Expect true: " + mine.equals(same));
	System.out.println("Expect true: " + mine.equals(alias));
	System.out.println("Expect false: " + mine.equals(yours));
	
    }

}
