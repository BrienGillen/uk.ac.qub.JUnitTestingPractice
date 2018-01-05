package testTestingPractice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import testingPractice.mp3;

public class MP3test {

	int refNumberValid, refNumberInvalid, ratingValid, ratingInvalidLower, ratingInvalidUpper, songLengthValid, songLengthInvalidUpper, songLengthInvalidLower;
	String artistValid, artistInvalid, songNameValid, songNameInvalid;
	
	@Before
	public void setUp() throws Exception {
		refNumberValid = 1;
		refNumberInvalid = -1;
		ratingValid = 2;
		ratingInvalidLower = 0;
		ratingInvalidUpper = 6;
		songLengthValid = 500;
		songLengthInvalidUpper = 2540;
		songLengthInvalidLower = 0;
		
		artistValid = "artistvalid";
		artistInvalid = "artistinvalid";
		songNameValid = "songvalid";
		songNameInvalid = "songinvalid";
		
	}

	/**
	 * Testing default constructor
	 */
	@Test
	public void testMp3DefaultConstructor() {
		mp3 myMp3 = new mp3();
		assertNotNull(myMp3);
	}
	
	@Test
	public void testMp3NondefaultConstructor() {
		
		mp3 myMp3 = new mp3(refNumberValid, artistValid, songNameValid, ratingValid);
		assertNotNull(myMp3);
		
		/**
		 * 
		 */
		assertEquals(refNumberValid, myMp3.getRef());
		assertEquals(artistValid, myMp3.getArtist());
		assertEquals(songNameValid, myMp3.getSongName());
		assertEquals(ratingValid, myMp3.getRating());
		
	}
	
	@Test
	public void testRef() {
		mp3 myMp3 = new mp3();
		myMp3.setRef(refNumberValid);
		assertEquals(refNumberValid, myMp3.getRef());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testRefException() {
		mp3 myMp3 = new mp3();
		myMp3.setRef(refNumberInvalid);
	}

	@Test
	public void testArtist() {
		mp3 myMp3 = new mp3();
		myMp3.setArtist(artistValid);
		assertEquals(artistValid, myMp3.getArtist());
	}

	@Test
	public void testSongName() {
		mp3 myMp3 = new mp3();
		myMp3.setSongName(songNameValid);
		assertEquals(songNameValid, myMp3.getSongName());
	}

	@Test
	public void testRatingValid() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(ratingValid);
		assertEquals(ratingValid, myMp3.getRating());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testRatingInvalidLower() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(ratingInvalidLower);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testRatingInvalidUpper() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(ratingInvalidUpper);
	}
	
	@Test
	public void testSongLengthValid() {
		mp3 myMp3 = new mp3();
		myMp3.setSongLength(songLengthValid);
		assertEquals(songLengthValid, myMp3.getSongLength());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSongLengthInvalidLower() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(songLengthInvalidLower);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSongLengthInvalidUpper() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(songLengthInvalidUpper);
	}

}
