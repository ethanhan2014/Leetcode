package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegertoRomanTest {

	@Test
	public void testIntToRoman() {
		IntegertoRoman sol = new IntegertoRoman();
		assertEquals("IV",sol.intToRoman(4));
		assertEquals("IX",sol.intToRoman(9));
		assertEquals("CMXCIX",sol.intToRoman(999));
		assertEquals("MMMCMXCIX",sol.intToRoman(3999));
	}

}
