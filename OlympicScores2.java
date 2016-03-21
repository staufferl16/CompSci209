/**
 * This program calculates Olympic Gymnastics Scores.
 * It is improved from Assign1's OlympicGames.java program.
 * Input from user is required to find data file.
 * 
 * 
 * @author: Leigh Stauffer
 */
import java.util.List;  //Import List (parent of ArrayList)
import java.util.ArrayList; //Import Arrays module
import java.util.Scanner; //Import Scanner for getting input
import java.io.*;  //Import io packages for BufferedReader and FileReader
import java.util.Collections;  //Import Collections for containing the scores


public class OlympicScores2 {

    static double AVERAGE_DIFFICULTY; //initialize class variable (difficulty)
    static List<Double> judgesScores = new ArrayList<>(); //set up array for scores
    static String IN_FILE;
    static double sum;

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in); //Open Scanner on the console input
		
		scan.useDelimiter("\n"); //Breaks up by lines
		
		String difficultyPrompt = "Enter difficulty score (as a decimal/double): ";
		promptAndHandleDoubleInput(scan, difficultyPrompt);
		
		AVERAGE_DIFFICULTY = scan.nextDouble();
		scan.nextLine();
		
		String scoresFilePrompt = "Enter filename where scores are held: ";
		promptAndHandleStringInput(scan, scoresFilePrompt);
		IN_FILE = scan.next();
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(IN_FILE));
	
			String line;
			while ((line = input.readLine()) != null) {
				// System.out.println(line);
				double score = Double.parseDouble(line);
				judgesScores.add(score);
			}
	
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println(IN_FILE
					+ ", containing the survey results, not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out
					.println("Something went wrong while importing results from"
							+ IN_FILE);
			e.printStackTrace();
		}
	
	System.out.println("Gymnastics Scores" + "\n" + "---------------------");
	System.out.print("Judges Execution Scores:  ");  //printing judges scores
	Collections.sort(judgesScores);
	for (int i=0; i < judgesScores.size(); i++){
	    System.out.print(judgesScores.get(i) + "  ");
	}
	System.out.print("\n");
	double average = 0;
	for (int i=0; i < judgesScores.size(); i++) {  //calculating average
	    average += judgesScores.get(i);
	}
	average = average / (judgesScores.size());
	System.out.println("Average Execution Score: " + average);  //printing execution score
	System.out.println("Average Difficulty Score: " + AVERAGE_DIFFICULTY);  //printing average difficulty
	System.out.println("The Final Score: " + (AVERAGE_DIFFICULTY + average));  //printing final score
    }

    
    /**
     * Handles prompting for interger input and verifying that we get a double.
     * This code was based on Professor Sprenkle's example code for Scanning.
     *
     * @author Professor Sprenkle (edited by Leigh Stauffer)
     * @param scan
     * @param prompt
     */
    private static void promptAndHandleDoubleInput(Scanner scan, String prompt) {
		System.out.print(prompt);

		// check for bad input, read in the integer representing the width
		while (!scan.hasNextDouble()) {
			handleBadInput(scan, prompt);
		}
	}
	
	private static void promptAndHandleStringInput(Scanner scan, String prompt) {
		System.out.print(prompt);
		
		while (!scan.hasNext()){
			handleBadInput(scan, prompt);
		}
	}
	
	/**
	 * When the user enters bad input, remove the rest of what's on the line
	 * from the scanner and print out an error message and a reminder of what
	 * the input should look like.
	 * This code was based on Professor Sprenkle's example code for Scanning.
	 *
	 * @author Professor Sprenkle (edited by Leigh Stauffer)
	 * @param scan
	 * @param prompt
	 */
	public static void handleBadInput(Scanner scan, String prompt) {
		// read the bad input (up to the \n, which is what the user
		// entered to trigger reading the input)
		if (scan.hasNextLine()) {
			scan.nextLine();
		}

		// give an error message and then repeat what we want
		System.out.println("Incorrect input.");
		System.out.print(prompt);
	}
	
    
}