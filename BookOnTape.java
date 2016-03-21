/**
 * 
 */
package edu.wlu.cs.staufferl;

/**
 * @author staufferl
 * This class describes the Book On Tape child class which inherits from Media Item.
 * Has unique fields author and narrator.
 *
 */
public class BookOnTape extends MediaItem {

	private String author;
	private String narrator;
	
	/**
	 * @param title
	 * @param isPresent
	 * @param playingTime
	 * @param copyrightYear
	 * @param author
	 * @param narrator
	 * Constructor for BookOnTape
	 */
	public BookOnTape(String title, boolean isPresent, double playingTime, int copyrightYear, String author, String narrator) {
		super(title, isPresent, playingTime, copyrightYear);
		this.author = author;
		this.narrator = narrator;
	}

	/**
	 * @return the author
	 * Person who wrote the original book
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the narrator
	 * Person who reads the book out loud
	 */
	public String getNarrator() {
		return narrator;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * String representation of BookOnTape, includes all relevant fields
	 */
	@Override
	public String toString() {
		return "BookOnTape[author=" + getAuthor() + ", narrator=" + getNarrator() + ", title=" + getTitle() + ", isPresent="
				+ isPresent() + ", playingTime=" + getPlayingTime() + ", copyrightYear=" + getCopyrightYear() + "]";
	}

	/**
	 * @param args
	 * Tester program for BookOnTape.
	 */
	public static void main(String[] args) {
		BookOnTape myBook = new BookOnTape("The Art Forger", false, 600.00, 2012, "B.A. Shapiro", "Xe Sands");
		System.out.println("Getting title: " + myBook.getTitle());
		System.out.println("Getting rating: " + myBook.getAuthor());
		System.out.println("Getting narrator: " + myBook.getNarrator());
		System.out.println("Expect false: " + myBook.isPresent());
		myBook.setStatus(true);
		System.out.println("Expect true: " + myBook.isPresent());
		System.out.println("Getting playing time: " + myBook.getPlayingTime());
		System.out.println("Getting copyright year: " + myBook.getCopyrightYear());
		System.out.println("String representation of DVD: " + myBook.toString());

	}

}
