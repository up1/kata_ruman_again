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

}
