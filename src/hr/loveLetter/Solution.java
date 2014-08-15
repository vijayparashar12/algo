package hr.loveLetter;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOftestCases = scanner.nextInt();
		for (int i = 0; i < noOftestCases; i++) {
			String testCase = scanner.nextLine();
			if (isPalindromes(testCase)) {
				System.out.println(0);
			} else {
				int moves = convertToPalindromes(testCase);
				System.out.println(moves);
			}
		}
		scanner.close();
	}

	protected static int convertToPalindromes(String testCase) {
		
		return 0;
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
