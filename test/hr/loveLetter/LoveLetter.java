package hr.loveLetter;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoveLetter {

	@Test
	public void verifyPalindrome() {
		assertTrue(Solution.isPalindromes("aaa"));
		assertTrue(Solution.isPalindromes("abba"));
		assertFalse(Solution.isPalindromes("vijay"));
	}

	@Test
	public void verifyCountMove() throws Exception {
		assertEquals(2, Solution.countToPalindromes("abc"));
		assertEquals(0, Solution.countToPalindromes("abcba"));
		assertEquals(4, Solution.countToPalindromes("abcd"));
		assertEquals(11, Solution.countToPalindromes("vijay"));
	}

}
