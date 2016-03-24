package string;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GenerateParenthesisTest {

	@Test
	public void testGenerateParenthesis() {
		GenerateParenthesis sol = new GenerateParenthesis();
		List<String> ans1 = new ArrayList<String>();
		ans1.add("((()))");
		ans1.add("(()())");
		ans1.add("(())()");
		ans1.add("()(())");
		ans1.add("()()()");
		assertTrue(sol.generateParenthesis(3).containsAll(ans1));
	}

}
