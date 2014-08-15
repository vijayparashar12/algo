package hr;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = sum(a,b);
		System.out.println(c);
		scanner.close();
	}

	private static int sum(int a, int b) {
		return a+b;
	}
}
