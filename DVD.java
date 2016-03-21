/**
 * 
 */
package edu.wlu.cs.staufferl;

/**
 * @author staufferl
 *
 * This is a child class that defines the DVD media item.  It is a child class
 * of MediaItem.  Has new fields rating and bounus feature time.
 */
public class DVD extends MediaItem {
	
	//New fields unique to DVD
	private String rating;
	private double bonusFeatTime;

	/**
	 * @param title
	 * @param isPresent
	 * @param playingTime
	 * @param copyrightYear
	 * @param rating
	 * @param bonusFeatTime
	 * Constructor for DVD child class
	 */
	public DVD(String title, boolean isPresent, double playingTime, int copyrightYear, String rating, double bonusFeatTime) {
		super(title, isPresent, playingTime, copyrightYear);
		this.rating = rating;
		this.bonusFeatTime = bonusFeatTime;
	}
	
	/**
	 * @return the rating
	 * String representation of DVD's rating.
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @return the bonusFeatTime
	 * The time of the bonus feature specials
	 */
	public double getBonusFeatTime() {
		return bonusFeatTime;
	}

	/*
	 * Has to include total playing time (playing time + bonusFeatTime)
	 * @see edu.wlu.cs.staufferl.MediaItem#getPlayingTime()
	 */
	@Override
	public double getPlayingTime(){
		return super.getPlayingTime() + getBonusFeatTime();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * toString() needs to include additional CD fields (ones that MediaItem doesn't have).
	 */
	@Override
	public String toString() {
		return "DVD[title=" + getTitle() + ", isPresent=" + isPresent() + ", playingTime=" + getPlayingTime()
				+ ", copyrightYear=" + getCopyrightYear() +", rating=" + getRating() + ", bonusFeatureTime="
				+ getBonusFeatTime() + "]";
	}

	/**
	 * @param args
	 * Tester program for DVD child class - proper inheritance checked
	 */
	public static void main(String[] args) {
		DVD myDVD = new DVD("2001: A Space Odyssey", false, 161.23, 1968, "G", 34.26);
		System.out.println("Getting title: " + myDVD.getTitle());
		System.out.println("Getting rating: " + myDVD.getRating());
		System.out.println("Expect false: " + myDVD.isPresent());
		myDVD.setStatus(true);
		System.out.println("Expect true: " + myDVD.isPresent());
		System.out.println("Getting playing time: " + myDVD.getPlayingTime());
		System.out.println("Getting copyright year: " + myDVD.getCopyrightYear());
		System.out.println("String representation of DVD: " + myDVD.toString());

	}

}
