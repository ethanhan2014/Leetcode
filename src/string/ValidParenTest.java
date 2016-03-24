package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidParenTest {

	@Test
	public void testIsValid() {
		ValidParen sol = new ValidParen();
		assertTrue(sol.isValid("()"));
		assertTrue(sol.isValid("[]"));
		assertTrue(sol.isValid("{}"));
		assertTrue(sol.isValid("{[()]}"));
		assertFalse(sol.isValid("([)]"));
		assertFalse(sol.isValid("{]"));
	}

}
