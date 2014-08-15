package hr.utopaintree;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTest = scanner.nextInt();
		for (int i = 0; i < noOfTest; i++) {
			System.out.println(heightOfTree(scanner.nextInt()));
		}
		scanner.close();
	}

	protected static int heightOfTree(int nextInt) {
		int height = 1;
		for (int i = 1; i <= nextInt; i++) {
			if (i % 2 == 0) {
				height++;
			} else {
				height *= 2;
			}
		}
		return height;
	}
}
