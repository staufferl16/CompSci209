/**
 * Birthday Class.  This program has two constructors. One
 * generates a Birthday object with the specified month and day 
 * and another that generates a Birthday object with a random
 * month and day. 
 *
 * @author: Leigh Stauffer
 */
import java.util.Random;
import java.lang.String;

public class Birthday {

    // ----Instance Variables----
    private int month;  //Which month of the year (12 options)
    private int day;  //Which day of the month (up to 31 options)
    private static final int[] monthDayMax = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private Random randomizer = new Random();

    /**
     * Create new Birthday objects.
     * If no month or day is specified, generate random B-day.
     * Otherwise, generate B-day object of specified month and day.
     */
    public Birthday( int month, int day){
	if (0 < month && month < 13) {
	    this.month = month;
        }
	else {
	    System.out.println("Incorrect month integer");
	    System.exit(0);
	}
	if (0 < day && day <= monthDayMax[month-1]) {
	    this.day = day;
	}
	else {
	    System.out.println("Incorrect day integer");
	    System.exit(0);
	}
    }
    public Birthday( ) {
    // If no parameter specification, generate random birthday object.
	this.month = randomizer.nextInt(13);
        int dayBound = monthDayMax[month-1];
	this.day = randomizer.nextInt(dayBound+1);
    }	
    //----Getter methods----
    public int getMonth(){
	return month;
    }
    public int getDay(){
	return day;
    }

    //----Setter methods----
    public void setMonth(int m){
        month = m;
    }
    public void setDay(int d){
	day = d;
    }

    //Test class, constructors, accessors, and mutators.
    public static void main(String[] args) {
	//Initialize Birthday objects that will be used throughout testing.
        Birthday myBirthday = new Birthday(3, 8);
        Birthday randomBirthday = new Birthday();

        System.out.println("Created specific Birthday object: " + myBirthday);
	System.out.println("Month: " + myBirthday.month + "    Day: " + myBirthday.day);
	System.out.println("Created random Birthday objects: " + randomBirthday);
	System.out.println("Month: " + randomBirthday.month + "    Day: " + randomBirthday.day);
	System.out.println("Testing getters: " + randomBirthday.getMonth() + "/" + randomBirthday.getDay());
	System.out.println("Testing getters: " + myBirthday.getMonth() + "/" + myBirthday.getDay());
	randomBirthday.setMonth(3);
	randomBirthday.setDay(25);
	myBirthday.setMonth(12);
        myBirthday.setDay(25);
	System.out.println("Expect 12/25: " + myBirthday.getMonth() + "/" + myBirthday.getDay());
	System.out.println("Expect 3/25: " + randomBirthday.getMonth() + "/" + randomBirthday.getDay());
	//System.out.println("Expect error due to month...");
	//Birthday wrongMonth = new Birthday(15, 6);
	//System.out.println("Expect error due to day...");
	//Birthday wrongDay = new Birthday(6, 31);
    }
}
            
