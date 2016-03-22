package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZigZagConversionTest {

	@Test
	public void testConvert() {
		ZigZagConversion sol = new ZigZagConversion();
		
		assertEquals("PAHNAPLSIIGYIR",sol.convert("PAYPALISHIRING", 3));
		assertEquals("A",sol.convert("A", 1));
	}

}
