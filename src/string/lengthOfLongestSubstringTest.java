package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class lengthOfLongestSubstringTest {

	@Test
	public void testLongestLength() {
		assertEquals(1, lengthOfLongestSubstring.longestLength("bbbbbbb"));
		assertEquals(3, lengthOfLongestSubstring.longestLength("abcabc"));
		assertEquals(2, lengthOfLongestSubstring.longestLength("aabbcc"));
		assertEquals(0, lengthOfLongestSubstring.longestLength(""));
		assertEquals(1, lengthOfLongestSubstring.longestLength("a"));
	}

}
