/**
 * This program takes a single string (given at the command-line) and
 * displays the reversed given string.  Uses StringBuilder.
 * 
 * 
 * @author: Leigh Stauffer
 */
import java.lang.String; //Import String module.
import java.lang.StringBuilder; //Import String module.

public class ReverseString {

    public static void main(String[] args) {
        //If no arguments, exit program.
    	if( args.length < 1 ){
  	    System.out.println("Error: Need a command-line argument.");
  	    System.exit(1);
	}
	//If argument has length of one, print and exit. (Already "reversed")
	else if ( args[0].length() == 1) {
	    System.out.println(args[0] + " is already reversed.");
	    System.exit(1);
	}
	//Use StringBuilder to make and return the reversed argument.
	else {
	    StringBuilder revStr = new StringBuilder( args[0]);
            System.out.println( args[0] + " backwards is " + revStr.reverse());
 	}
    }
}
