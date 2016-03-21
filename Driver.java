/**
 * 
 */
package edu.wlu.cs.staufferl;
import java.util.Arrays;

/**
 * @author staufferl
 * This program acts like a library, and tests all the accessors
 * and mutators for every type of media item. Uses comparable.
 */
public class Driver {
	
	//Array holding media items
	private static MediaItem[] myLibrary= new MediaItem[6];
	
	/**
	 * @param args
	 * Initializes media items, adds them to array, sorts array, prints relevant
	 * information on each media item using accessors, mutators, getters, and 
	 * setters.
	 */
	public static void main(String[] args) {
		
		//Creating media items.
		CD myCD1 = new CD("Every Open Eye", true, 42.00, 2015, "CHVCHES", 11);
		CD myCD2 = new CD("Cease To Begin", false, 34.00, 2007, "Band of Horses", 10);
		DVD myDVD1 = new DVD("2001: A Space Odyssey", true, 161.23, 1968, "G", 34.26);
		DVD myDVD2 = new DVD("Mad Max: Fury Road", false, 120.45, 2015, "R", 46.04);
		BookOnTape myBook1 = new BookOnTape("Infinite Jest", true, 3374.03, 2012, "David Foster Wallace", "Sean Pratt");
		BookOnTape myBook2 = new BookOnTape("Oyster", false, 589.12, 2003, "John Biguenet", "Xe Sands");
		
		//Adding media items to Library Array
		myLibrary[0] = myCD1;
		myLibrary[1] = myCD2;
		myLibrary[2] = myDVD1;
		myLibrary[3] = myDVD2;
		myLibrary[4] = myBook1;
		myLibrary[5] = myBook2;
		
		//Sorting myLibrary (the array of MediaItems)
		Arrays.sort(myLibrary);
		
		System.out.println("Sorted Array...");
		for(int i=0; i<myLibrary.length; i++){
			System.out.println(myLibrary[i]);
		}
		
		//Iterate through myLibrary and print info using dynamic dispatch
		System.out.println("What's in this library....");
		for(int i=0; i<myLibrary.length; i++){
			MediaItem media = myLibrary[i];
			System.out.println("Title: " + media.getTitle() + " Available: " + media.isPresent()
								+ " Playing Time: " + media.getPlayingTime() + " Copyright Year: " + media.getCopyrightYear());
			if(media instanceof CD){
				System.out.println("Artist: " +((CD)media).getArtist() + " Number of Tracks: " + ((CD)media).getNumOfTracks());
			}
			else if(media instanceof DVD){
				System.out.println("Rating: " + ((DVD)media).getRating() + " Bonus Feature Time: " + ((DVD)media).getBonusFeatTime());
			}
			else if(media instanceof BookOnTape){
				System.out.println("Author: "+ ((BookOnTape)media).getAuthor() + " Narrator: " + ((BookOnTape)media).getNarrator());
			}
			System.out.println("String representation: " + media.toString() + "\r");
		}
		for(int i=0; i<myLibrary.length; i++){
			if(myLibrary[i].isPresent() == false){
				System.out.println(myLibrary[i].getTitle() + " is currently checked out");
			}
			else{
				System.out.println(myLibrary[i].getTitle() + " is currently available.");
			}
		}
		System.out.println("Everything currently unavailable is about to be checked in...");
		for(int x=0; x<myLibrary.length; x++){
			if(myLibrary[x].isPresent() == false){
				myLibrary[x].setStatus(true);
			}
		}
		System.out.println("Expect zero");
		int numberOut = 0;
		for(int y=0; y<myLibrary.length; y++){
			if(myLibrary[y].isPresent() == false){
				numberOut += 1;
			}
		}
		System.out.println(numberOut);
		
	}

}
