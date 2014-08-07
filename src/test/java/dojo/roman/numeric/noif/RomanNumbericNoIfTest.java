package dojo.roman.numeric.noif;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumbericNoIfTest {
	
	Roman roman = new Roman();

	@Test
	public void numberLessOrEqualThanThreeShouldShowAllInI() {
		assertEquals("I", roman.convert(1));
		assertEquals("II", roman.convert(2));
		assertEquals("III", roman.convert(3));
	}
	
	@Test
	public void numberFourShoudReturnIV() {
		assertEquals("IV", roman.convert(4));
	}
	
	@Test
	public void numberFiveShoudReturnIV() {
		assertEquals("V", roman.convert(5));
	}
	
	@Test
	public void numberLessOrEqualThanEightShouldShowInFormatVI() {
		assertEquals("VI", roman.convert(6));
		assertEquals("VII", roman.convert(7));
		assertEquals("VIII", roman.convert(8));
	}
	
	@Test
	public void numberNineShoudReturnIX() {
		assertEquals("IX", roman.convert(9));
	}
	
	@Test
	public void anothercase() {
		assertEquals("X", roman.convert(10));
		assertEquals("L", roman.convert(50));
		assertEquals("C", roman.convert(100));
		assertEquals("D", roman.convert(500));
		assertEquals("M", roman.convert(1000));
	}

}
