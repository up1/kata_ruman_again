package dojo.roman.numeric.noif;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumbericNoIfTest {

	@Test
	public void numberLessOrEqualThanThreeShouldShowAllInI() {
		Roman roman = new Roman();
		assertEquals("I", roman.convert(1));
		assertEquals("II", roman.convert(2));
		assertEquals("III", roman.convert(3));
	}
	
	@Test
	public void numberFourShoudReturnIV() {
		Roman roman = new Roman();
		assertEquals("IV", roman.convert(4));
	}

}
