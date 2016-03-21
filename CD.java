/**
 * 
 */
package edu.wlu.cs.staufferl;

/**
 * @author staufferl
 *
 * This class defines the compact disk class, a child class of MediaItem.
 * Has artist field and number of tracks field.
 */
public class CD extends MediaItem {
	
	private String artist;   // Artist of CD
	private int numOfTracks; // Number of tracks in CD
	
	// Constructor for child class. Uses super to instantiate fields inherited from parent class.
	public CD(String title, boolean isPresent, double playingTime, int copyrightYear, String artist, int numOfTracks) {
		super(title, isPresent, playingTime, copyrightYear);
		this.artist = artist;
		this.numOfTracks = numOfTracks;
	}

	/**
	 * @return the artist
	 * Artist of the CD
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @return the numOfTracks
	 * Number of tracks on the CD
	 */
	public int getNumOfTracks() {
		return numOfTracks;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * toString() needs to include additional CD fields (ones that MediaItem doesn't have).
	 */
	@Override
	public String toString() {
		return "CD [title=" + getTitle() + ", isPresent=" + isPresent() + ", playingTime=" + getPlayingTime()
				+ ", copyrightYear=" + getCopyrightYear() +", artist=" + getArtist() + ", numOfTracks=" + getNumOfTracks() + "]";
	}

	/**
	 * @param args
	 * Testing CD child class. 
	 * Make sure it properly inherits from parent class/super class.
	 */
	public static void main(String[] args) {
		CD myCD = new CD("Currents", false, 51.00, 2015, "Tame Impala", 13);
		System.out.println("Getting title: " + myCD.getTitle());
		System.out.println("Getting artist: " + myCD.getArtist());
		System.out.println("Expect false: " + myCD.isPresent());
		myCD.setStatus(true);
		System.out.println("Expect true: " + myCD.isPresent());
		System.out.println("Getting playing time: " + myCD.getPlayingTime());
		System.out.println("Getting copyright year: " + myCD.getCopyrightYear());
		System.out.println("Getting number of tracks: " + myCD.getNumOfTracks());
		System.out.println("String representation of CD: " + myCD.toString());

	}

}
