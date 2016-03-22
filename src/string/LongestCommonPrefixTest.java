package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestCommonPrefixTest {

	@Test
	public void testLongestCommonPrefix() {
		LongestCommonPrefix sol = new LongestCommonPrefix();
		String[] strs1 = {"aaa","aaaa","aaaaa"};
		assertEquals("aaa",sol.longestCommonPrefix(strs1));
		String[] strs2 = {"aaa","abaa","aaaaa"};
		assertEquals("a",sol.longestCommonPrefix(strs2));
		String[] strs3 = {"aba","abaa","aaaaa"};
		assertEquals("a",sol.longestCommonPrefix(strs3));
		String[] strs4 = {"cba","abaa","aaaaa"};
		assertEquals("",sol.longestCommonPrefix(strs4));
		String[] strs5 = {""};
		assertEquals("",sol.longestCommonPrefix(strs5));
		String[] strs6 = new String[0];
		assertEquals("",sol.longestCommonPrefix(strs6));
		String[] strs7 = {"a","b"};
		assertEquals("",sol.longestCommonPrefix(strs7));
		String[] strs8 = {"a"};
		assertEquals("a",sol.longestCommonPrefix(strs8));
	}

}
