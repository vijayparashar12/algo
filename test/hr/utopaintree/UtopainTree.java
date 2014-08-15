package hr.utopaintree;

import static org.junit.Assert.*;
import hr.utopaintree.Solution;

import org.junit.Test;

public class UtopainTree {

	@Test
	public void verifySolutionForZeroItireation() {
		assertEquals(1, Solution.heightOfTree(0));
	}

	@Test
	public void verifySolutionForOddItireations() throws Exception {
		assertEquals(2, Solution.heightOfTree(1));
		assertEquals(6, Solution.heightOfTree(3));
	}

	@Test
	public void verifyEvenItirations() throws Exception {
		assertEquals(7, Solution.heightOfTree(4));
		assertEquals(15, Solution.heightOfTree(6));
	}
}
