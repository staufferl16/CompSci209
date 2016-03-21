/*
 * Reverse method:
 * @param s the String to reverse
 * @return the string backwards; e.g., string --> gnirts
 * 
 * isPalindrome method:
 * Tests a string to see if it is a palindrome.
 * @return boolean
 * @param s the String to reverse
 *
 * @author: Leigh Stauffer
 */
import java.lang.StringBuilder;
import java.lang.String;

public class StringUtils {

    private static String reverse(String string){
        StringBuilder revStr = new StringBuilder(string);
	return revStr.reverse().toString();
    }

    private static boolean isPalindrome(String string){
	String lowerCaseStr = string.toLowerCase().replaceAll(" ","");  //Converts string to all lower-case and then removes spaces.
	String revStr = StringUtils.reverse(lowerCaseStr);  //Reverses string for comparison.
	if (revStr.equals(lowerCaseStr)){
	    return true;
	}
	else{
	    return false;
	}
    }

    public static void main(String[] args){
	String tester1 = "Leigh";
	String tester2 = "kAyak";
	String tester3 = "A man a plan a canal Panama";
	System.out.println("Test reverse method: " + StringUtils.reverse(tester1));
	System.out.println("Test reverse method: " + StringUtils.reverse(tester2));
	System.out.println("Expect true: " + StringUtils.isPalindrome(tester2));
	System.out.println("Expect false: " + StringUtils.isPalindrome(tester1));
	System.out.println("Expect true: " + StringUtils.isPalindrome(tester3));
    }
}
 /* It is appropriate for these methods/class to be static, because
 it is not necessary, and more memory expensive, to create an
 object to carry out the task at hand, especially when static methods
 are the only tools required. There isn't any need for
 states or instances, either, so a static method is the most efficient
 means to carry out this task.*/
