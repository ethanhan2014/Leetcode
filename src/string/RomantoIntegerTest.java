package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomantoIntegerTest {

	@Test
	public void testRomanToInt() {
		RomantoInteger sol = new RomantoInteger();
		assertEquals(9,sol.romanToInt("IX"));
		assertEquals(3999,sol.romanToInt("MMMCMXCIX"));
	}

}
