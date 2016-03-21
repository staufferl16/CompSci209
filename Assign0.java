/**
 * Name: Leigh Stauffer
 * Assignment: 0
 * File Name: Assign0.java
 *
 * Original program contains errors.
 * Add your name to this comment.
 *
 * Document the errors you found in comments.  You should find at
 * least 5 errors.  Some errors are compiler errors and some are
 * logic errors that you'll find by executing/testing the program.
 * 
 * Comment out the original and write the corrected code.  In
 * comments, explain what you did to fix the error.
 */
public class Assign0 {  //Needed bracket and renamed to match filename

    public static void main(String[] args) {  
	int firstI, secondI;       
        double firstD, secondD;  //double firstD; secondD;

	firstI = 5;  //int firstI = 5;  Previously declared               
	secondI = 10;
	firstD = 3.12; //moved here to be visible to print statement
        secondD = 7.4; //moved here to be visible to print statement
	System.out.println("When you add " + firstI + " and " + secondI);
        // " and  + secondI); was the unclosed string literal error
	System.out.println("You get: " + (firstI + secondI));  //logic error

	System.out.println("When you add " + firstD + " and " + secondD);

	System.out.println("You get: " + (firstD + secondD));  //logic error fixed
    }

}
