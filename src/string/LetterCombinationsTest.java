package string;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LetterCombinationsTest {

	@Test
	public void testLetterCombinations() {
		LetterCombinations sol = new LetterCombinations();
		List<String> ans1 = new ArrayList<String>();
		assertEquals(ans1,sol.letterCombinations("01"));
		List<String> ans2 = 
				Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
		assertEquals(ans2,sol.letterCombinations("23"));
	}

}
