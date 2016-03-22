package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegexTest {

	@Test
	public void testIsMatch() {
		Regex sol = new Regex();
		
		assertTrue(sol.isMatch("aa", "aa"));
		assertFalse(sol.isMatch("aa", "a"));
		assertFalse(sol.isMatch("aaa", "aa"));
		assertTrue(sol.isMatch("aa", "a*"));
		assertTrue(sol.isMatch("aa", ".*"));
		assertTrue(sol.isMatch("ab", ".*"));
		assertTrue(sol.isMatch("aab", "c*a*b"));
		assertTrue(sol.isMatch("", ""));
		assertFalse(sol.isMatch("", "*"));
		assertTrue(sol.isMatch("aaa", "ab*a*c*a"));
	}

}



