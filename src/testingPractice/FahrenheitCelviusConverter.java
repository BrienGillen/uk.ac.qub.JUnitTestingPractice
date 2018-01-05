package testingPractice;

public class FahrenheitCelviusConverter {

	/**
	 * Practical Unit Testing with JUnit and Mockito - source code for
	 * exercises. Visit http://practicalunittesting.com for more information.
	 *
	 * @author Tomek Kaczanowski
	 */

	public static double toCelcius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public static double toFahrenheit(double celcius) {
		return celcius * 9 / 5 + 32;
	}
	
	
}
