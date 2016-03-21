/**
 * 
 */
package edu.wlu.cs.staufferl;

//Imported packages
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;

/**
 * @author staufferl
 * This is a colleciton-based driver.  By using collections, this program
 * acts like a library by using robust, efficient, succinct code.
 * Dynamic Dispatch is able to work as it should.
 */
public class CollectionDriver {
	
	//Array holding media items
	private static List<MediaItem> myLibrary = new ArrayList<>();
	
	//Iterator to be used later
	//private static Iterator<MediaItem> i = myLibrary.iterator();
	
	/**
	 * @param args
	 * Library-like program to test how collections can improve original driver.
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
		myLibrary.add(myCD1);
		myLibrary.add(myCD2);
		myLibrary.add(myDVD1);
		myLibrary.add(myDVD2);
		myLibrary.add(myBook1);
		myLibrary.add(myBook2);
		
		//Sorting myLibrary (the array of MediaItems)
		Collections.sort(myLibrary);
		
		System.out.println("Sorted library with collection implementation: ");
		
		//Printing Sorted Library
		for(MediaItem media : myLibrary){
			System.out.println(media.toString());
		}
		
	}

}

/*
 * For this collection-powered driver program, I chose to implement an ArrayList.
 * By using an ArrayList, access to media items based on position (which is predictable
 * if someone knows which films of which year are included) is constant time access.
 * The ability to resize the ArrayList also optimizes efficiency as the library expands.
 * Because ArrayList inherits from Collections, it also inherits useful methods such as
 * (but not limited to) sort, resize, get, contains, remove, add, size, sort, trimToSize,
 *  equals, and removeIf.
 * Having a collection of object also facilitates the use of dynamic dispatch, making code
 * easy to implement with minimal repetition and optimal robustness.  It also makes future
 * editing simpler (for example, if someone wanted all the child classes to inherit from
 * a new abstract class called Entertainment, they would only have to change the line
 * that says List<MediaItem> = new.... to List<Entertainment> = new....
 * 
 * Simple, optimal, robust!
 * 
 */