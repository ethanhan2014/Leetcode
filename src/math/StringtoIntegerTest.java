package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringtoIntegerTest {

	@Test
	public void testMyAtoi() {
		StringtoInteger sol = new StringtoInteger();
		assertEquals(123, sol.myAtoi("123"));
		assertEquals(-123, sol.myAtoi("-123"));
		assertEquals(0, sol.myAtoi("0"));
		assertEquals(0, sol.myAtoi("+"));
		assertEquals(0, sol.myAtoi("+-2"));
		assertEquals(-9, sol.myAtoi("            -9"));
		assertEquals(Integer.MAX_VALUE, sol.myAtoi("999999999999999"));
		assertEquals(Integer.MIN_VALUE, sol.myAtoi("-999999999999999"));
		assertEquals(-12, sol.myAtoi("  -0012a42"));
	}

}