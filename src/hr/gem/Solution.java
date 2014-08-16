package hr.gem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(
				"/home/vijay/Desktop/hr/input04.txt"));
		int noOftestCases = Integer.parseInt(scanner.nextLine());
		List<String> samples = new ArrayList<String>(noOftestCases);
		for (int i = 0; i < noOftestCases; i++) {
			String testCase = scanner.nextLine().trim();
			samples.add(testCase);
		}
		scanner.close();
		int num = findGemCount(samples);
		System.out.println(num);
	}

	protected static int findGemCount(List<String> samples) {
		int count = 0;
		Pattern pattern = Pattern.compile("[a-zA-Z]");
		String minLenStr = samples.stream()
				.min((s1, s2) -> s1.length() - s2.length()).get();
		Matcher matcher = pattern.matcher(minLenStr);
		Set<String> uniuqe = new HashSet<String>();
		while (matcher.find()) {
			String group = matcher.group();
			if (uniuqe.add(group)) {
				boolean flag = true;
				for (String s : samples) {
					if (!s.contains(group)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					count++;
				}
			}
		}
		return count;
	}
}
