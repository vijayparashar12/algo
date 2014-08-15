package hr.loveLetter;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOftestCases = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < noOftestCases; i++) {
			String testCase = scanner.nextLine();
			int moves = countToPalindromes(testCase);
			System.out.println(moves);
		}
		scanner.close();
	}

	protected static int countToPalindromes(String testCase) {
		int i = 0, j = testCase.length() - 1;
		int moves = 0;
		while (i <= j) {
			int c = (int) testCase.charAt(i++);
			int d = (int) testCase.charAt(j--);
			if (c > d) {
				moves = moves + (c - d);
			} else {
				moves = moves + (d - c);
			}

		}
		return moves;
	}

	protected static boolean isPalindromes(String testCase) {
		int j = testCase.length() - 1;
		for (int i = 0; i < testCase.length(); i++) {
			if (testCase.charAt(i) != testCase.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;
	}
}
