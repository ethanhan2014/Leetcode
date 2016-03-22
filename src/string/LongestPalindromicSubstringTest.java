package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestPalindromicSubstringTest {

	@Test
	public void testLongestPalindrome() {
		LongestPalindromicSubstring sol = new LongestPalindromicSubstring();
		assertEquals("a", sol.longestPalindrome("a"));
		assertEquals("aa",sol.longestPalindrome("aa"));
		assertEquals("aa",sol.longestPalindrome("aab"));
		assertEquals("abba",sol.longestPalindrome("abba"));
		assertEquals("",sol.longestPalindrome(""));
		assertEquals("abbba",sol.longestPalindrome("abcabbba"));
		assertEquals("gg",sol.longestPalindrome("abcdefgg"));
	}

}
