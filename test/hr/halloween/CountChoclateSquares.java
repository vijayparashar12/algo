package hr.halloween;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountChoclateSquares {

	@Test
	public void test() {
		assertEquals(6,Solution.getmaxSquares(5));
		assertEquals(9,Solution.getmaxSquares(6));
		assertEquals(12,Solution.getmaxSquares(7));
		assertEquals(16,Solution.getmaxSquares(8));
	}

}
