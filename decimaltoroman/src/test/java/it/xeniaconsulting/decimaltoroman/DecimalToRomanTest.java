package it.xeniaconsulting.decimaltoroman;

import org.junit.Test;

import junit.framework.TestCase;

public class DecimalToRomanTest extends TestCase {
    
	@Test
	public void testConvert1ToRoman() {
		String romanNumber = DecimalToRoman.converti(1);
		assertEquals("I",romanNumber);
	}
	
	@Test
	public void testConvert4ToRoman() {
		String romanNumber = DecimalToRoman.converti(4);
		assertEquals("IV",romanNumber);
	}
	
	
	@Test
	public void testConvert6ToRoman() {
		String romanNumber = DecimalToRoman.converti(6);
		assertEquals("VI",romanNumber);
	}
	
	@Test
	public void testConvert17ToRoman() {
		String romanNumber = DecimalToRoman.converti(17);
		assertEquals("XVII",romanNumber);
	}
	
	@Test
	public void testConvert33ToRoman() {
		String romanNumber = DecimalToRoman.converti(33);
		assertEquals("XXXIII",romanNumber);
	}
	
	@Test
	public void testConvert59ToRoman() {
		String romanNumber = DecimalToRoman.converti(59);
		assertEquals("LIX",romanNumber);
	}
	
	@Test
	public void testConvert178ToRoman() {
		String romanNumber = DecimalToRoman.converti(178);
		assertEquals("CLXXVIII",romanNumber);
	}
	
	@Test
	public void testConvert400ToRoman() {
		String romanNumber = DecimalToRoman.converti(400);
		assertEquals("CD",romanNumber);
	}
	
	@Test
	public void testConvert568ToRoman() {
		String romanNumber = DecimalToRoman.converti(568);
		assertEquals("DLXVIII",romanNumber);
	}
	
	@Test
	public void testConvert923ToRoman() {
		String romanNumber = DecimalToRoman.converti(923);
		assertEquals("CMXXIII",romanNumber);
	}
	
	@Test
	public void testConvert2786ToRoman() {
		String romanNumber = DecimalToRoman.converti(2786);
		assertEquals("MMDCCLXXXVI",romanNumber);
	}
	
}
