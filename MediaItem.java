/**
 * 
 */
package edu.wlu.cs.staufferl;

import java.lang.String;  //Import String package

/**
 * @author staufferl (Leigh Stauffer)
 * This class defines the characteristics and behaviors of all media
 * items.  Every media type contains a title, a track-able variable,
 * a playing time, and a copyright year.
 */
public abstract class MediaItem implements Comparable<MediaItem> {
	private String title;       //Media Item's title
	private boolean isPresent;  //Variable to track if item is currently present in collection
	protected double playingTime; //Playing time described in minutes
	private int copyrightYear;  //The year of the copyright
	
	/**
	 * Create constructor for MediaItem (to be the super class)
	 * @param title
	 * @param isPresent
	 * @param playingTime
	 * @param copyrightYear
	 */
	public MediaItem(String title, boolean isPresent, double playingTime, int copyrightYear) {
		this.title = title;
		this.isPresent = isPresent;
		this.playingTime = playingTime;
		this.copyrightYear = copyrightYear;
	}

	/**
	 * @return the title
	 * The title is what a movie is entitled.
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @return the isPresent
	 * Tells user whether or not a particular media item is present in library
	 */
	public boolean isPresent() {
		return isPresent;
	}


	/**
	 * @param isPresent the isPresent to set
	 * Updates whether or not media item is able to be checked out
	 */
	public void setStatus(boolean isPresent) {
		this.isPresent = isPresent;
	}


	/**
	 * @return the playingTime
	 * Displays how long the media item plays in minutes
	 */
	public double getPlayingTime() {
		return playingTime;
	}


	/**
	 * @return the copyrightYear
	 * Describes the year the media item was copyrighted
	 */
	public int getCopyrightYear() {
		return copyrightYear;
	}

	/*
	 * Compares MediaItems based on Copyright Year.
	 * @return -1 if less than, 0 if equal to, and 1 if greater than.
	 */
	@Override
	public int compareTo(MediaItem o) {
		if(this.getCopyrightYear() < o.getCopyrightYear()){
			return -1;
		}
		else if(this.getCopyrightYear() > o.getCopyrightYear()){
			return 1;
		}
		else{
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * returns a string representation of the media item
	 */
	@Override
	public String toString() {
		return "MediaItem [title=" + title + ", isPresent=" + isPresent + ", playingTime=" + playingTime
				+ ", copyrightYear=" + copyrightYear + "]";
	}

}