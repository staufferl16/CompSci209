/**
 * This program calculates Olympic Gymnastics Scores.
 * All numbers come from example. No input needed.
 * 
 * 
 * @author: Leigh Stauffer
 */
import java.util.Arrays; //Import Arrays module

public class OlympicScores {

    static final double AVERAGE_DIFFICULTY = 6.0; //initialize class variable (difficulty)

    public static void main(String[] args){
	System.out.println("Gymnastics Scores" + "\n" + "---------------------");
        double[] judgesExecutionScores = {8.7, 8.0, 9.2, 8.3, 8.7, 8.4};
	System.out.print("Judges Execution Scores:  ");  //printing judges scores
	for (int i=0; i < judgesExecutionScores.length; i++){
	    System.out.print(judgesExecutionScores[i] + " ");
	}
	System.out.print("\n");
 	Arrays.sort(judgesExecutionScores);  //sorting judgesExecutionScores array
	double average = 0;
	for (int i=1; i < judgesExecutionScores.length-1; i++) {  //calculating average
	    average = average + judgesExecutionScores[i];
	}
	average = average / (judgesExecutionScores.length - 2);
	System.out.println("Average Execution Score: " + average);  //printing execution score
	System.out.println("Average Difficulty Score: " + AVERAGE_DIFFICULTY);  //printing average difficulty
	System.out.println("The Final Score: " + (AVERAGE_DIFFICULTY + average));  //printing final score
    }
}
