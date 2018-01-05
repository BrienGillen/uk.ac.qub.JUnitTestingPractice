package testTestingPractice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import testingPractice.FahrenheitCelviusConverter;

public class FahrenheitCelviusConverterTest {

	double fahrenheit, celcius;
	FahrenheitCelviusConverter far;
	
	@Before
	public void setUp() throws Exception {
		fahrenheit = 55;
		celcius = 21;
		far = new FahrenheitCelviusConverter();
	}

	@Test
	public void testToCelcius() {
		double expected, actual;
		expected = (fahrenheit - 32) * 5 / 9;
		actual = FahrenheitCelviusConverter.toCelcius(fahrenheit);
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void testToFahrenheit() {
		double expected, actual;
		expected = celcius * 9 / 5 + 32;
		actual = FahrenheitCelviusConverter.toFahrenheit(celcius);
		assertEquals(expected, actual, 0.1);
	}

}
