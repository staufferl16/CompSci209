/**
 * Original program contains errors.
 * Add your name to this comment.
 *
 * Document (i.e., describe) the problems you found in comments.
 * Comment out the original and write the corrected code.  Add any
 * additional comments that help you explain what you did to fix the
 * code.
 * 
 * You may want to run this program with multiple command-line arguments
 * @author: Leigh Stauffer
 */
import java.util.Arrays;  //Need to import the Arrays module

public class Assign1 {

    public static void main(String[] args) {  
	System.out.println("The length of command-line args is " + args.length );  //args.length(): length is a field, don't need parenthesis.

	if ( args.length > 2 ) {
	    System.out.println("You have more than 2 arguments.");
	}

	//for( i=0; i < args.length; i++ ) {
        for (int i = 0; i < args.length; i++){  //need to declare i's type.
	    System.out.println("arg["+ i+ "] is " + args[i] + " with length " + args[i].length() ); //Give length parenthesis now, need string
	}

	Arrays.sort(args);  //need to declare new array's type

	System.out.println("The sorted command-line arguments are ");
        boolean hasACow = false; //Need to make hasACow accessible to 2nd if loop.
        //for ( i=0; i <= args.length; i++)
	for( int i=0; i <= args.length-1; i++ ) {  //need to declare i's type when initializing and take away one from the length.  Final index is one less than length.
	    System.out.println("\t" + args[i] );
            //if args[i] == "cow" {
	    if (args[i].equals("cow")) {  //Java's == does not function like Python's ==
                //boolean hasACow = true;
		hasACow = true;  //already declared hasACow as boolean type
	    }
	}

	System.out.print("You ");
	if( ! hasACow ) {
	    System.out.print("don't ");
	}
	System.out.println("have a cow, man.");
    }

}
