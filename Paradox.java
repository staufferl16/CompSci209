/*
 * This program generates a number of random Birthdays to test the
 * validity of the Birthday paradox.  Uses the Birthday class made
 * in a previous assignment to generate random Birthdays.
 *
 * @author: Leigh Stauffer
 */

public class Paradox {

    //Define class variables.
    private static int TRIALS = 30;  //Number of trials administered per group of a specific sample size.
    private static double trialSuccess;  //Boolean describing if there was a Birthday repeat.
    private static int numberOfPeople = 5;  //Initial sample size
    private static double[] positives = new double[20];  //Number of positive trials per sample size tested.

    public static boolean checkBdayArray(int sampleSize){  //Checks for duplicates while generating birthdays.
	Birthday[] bDayArray = new Birthday[sampleSize];
	for(int i=0; i<sampleSize; i++){
	    bDayArray[i] = new Birthday();
	    //System.out.println(bDayArray); (Originally made to confirm that array was built properly)
	    for(int n=0; n<i; n++){
		if(bDayArray[i].equals(bDayArray[n])){
		    return true;
	        }
	    }
	}
	return  false;
    }

    public static void main(String[] args){
	System.out.printf("%-15s%-15s%-15s%-15s%n","#People","#Trials","#Positive","Pct");
	for(int i=0; i<20; i++){
	    trialSuccess = 0;
	    //positives = new int[TRIALS];
	    for(int x=0; x<TRIALS; x++){
	        boolean success = checkBdayArray(numberOfPeople);
		if (success == true){
		    trialSuccess += 1;
		}
            }
	    positives[i] = trialSuccess;
	    double percentage = (positives[i] / TRIALS)*100;
	    System.out.printf("%-15d%-15d%-15d%-15.2f%n",numberOfPeople,TRIALS,(int)positives[i],percentage);
	    numberOfPeople += 5;
        }
    }
}
