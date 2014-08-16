package hr.halloween;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for (int i = 0; i < testCases; i++) {
			long cuts = scanner.nextLong();
			System.out.println(getmaxSquares(cuts));
		}
		scanner.close();
	}

	protected static long getmaxSquares(long cuts) {
		long v = 1;
		long h = cuts - v;
		long max = 0;
		while (h >= 1) {
			long squares = getSquares(v++, h--);
			if (squares > max) {
				max = squares;
			}
		}
		return max;
	}

	protected static long getSquares(long v, long h) {
		return h * v;
	}
}
