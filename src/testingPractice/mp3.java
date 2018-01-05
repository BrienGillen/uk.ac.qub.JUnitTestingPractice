package testingPractice;

/**
 * 
 * @author briengillen
 *
 */
public class mp3 {

	/**
	 * Declaration of the private variables used to output the required data
	 * about the music
	 */
	private int ref;

	/**
	 * 
	 */
	private String artist;

	/**
	 * 
	 */
	private String songName;

	/**
	 * 
	 */
	private int rating;

	/**
	 * 
	 */
	private int songLength;

	/**
	 * 
	 */
	public final static int LOWER_RATING = 0;

	/**
	 * 
	 */
	public mp3() {

	}

	/**
	 * 
	 * @param ref
	 * @param artist
	 * @param songName
	 * @param rating
	 */
	public mp3(int ref, String artist, String songName, int rating) {
		this.ref = ref;
		this.artist = artist;
		this.songName = songName;
		this.setRating(rating);
	}

	// Getter for the reference
	public int getRef() {
		return ref;
	}

	/**
	 * If reference is less than 0 then throw the illegal argument exceptions
	 * with the message Ref less than 0
	 * 
	 * @param ref
	 */
	public void setRef(int ref) throws IllegalArgumentException {

		if (ref >= 0) {
			this.ref = ref;
		} else {
			this.ref = ref;
			throw new IllegalArgumentException("Ref less than 0");
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * 
	 * @param artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/**
	 * 
	 * @return
	 */
	public String getSongName() {
		return songName;
	}

	/**
	 * 
	 * @param songName
	 */
	public void setSongName(String songName) {
		this.songName = songName;
	}

	/**
	 * 
	 * @return
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * Set the rating, ensure it is inside the values of 1 and 5
	 * 
	 * @param rating
	 */
	public void setRating(int rating) throws IllegalArgumentException {
		if ((rating > LOWER_RATING) && (rating < 6)) {
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("Rating not between 1 and 5");
		}

	}

	/**
	 * 
	 */
	public int getSongLength() {
		return songLength;
	}

	public void setSongLength(int songLength) throws IllegalArgumentException {
		if ((songLength > 0) && (songLength <= 2500)){
		this.songLength = songLength;
		} else {
			throw new IllegalArgumentException("Song length not within range 1-2500secs");
		}
	}

}
