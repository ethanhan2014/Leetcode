package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseIntegerTest {

	@Test
	public void testReverse() {
		ReverseInteger sol = new ReverseInteger();
		assertEquals(0,sol.reverse(0));
		assertEquals(321,sol.reverse(123));
		assertEquals(-321,sol.reverse(-123));
		assertEquals(1,sol.reverse(100));
		assertEquals(91,sol.reverse(190));
		assertEquals(0,sol.reverse(Integer.MAX_VALUE));
		assertEquals(0,sol.reverse(Integer.MIN_VALUE));
	}

}

