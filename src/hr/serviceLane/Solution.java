package hr.serviceLane;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		String inputLine1 = scanner.nextLine();
		Pattern p = Pattern.compile("\\d+");
		Matcher matcher = p.matcher(inputLine1);
		int length = 0;
		if (matcher.find()) {
			length = Integer.parseInt(matcher.group());
		}
		int testCase = 0;
		if (matcher.find()) {
			testCase = Integer.parseInt(matcher.group());
		}

		String widthInput = scanner.nextLine();
		matcher = p.matcher(widthInput);
		int[] widhtArray = new int[length];
		for (int i = 0; i < length; i++) {
			matcher.find();
			widhtArray[i] = Integer.parseInt(matcher.group());
		}

		int entry = 0;
		int exit = 0;
		for (int i = 0; i < testCase; i++) {
			String entryExit = scanner.nextLine();
			matcher = p.matcher(entryExit);
			matcher.find();
			entry = Integer.parseInt(matcher.group());
			matcher.find();
			exit = Integer.parseInt(matcher.group());
			System.out.println(getVehiclesType(entry, exit, widhtArray));
		}
		scanner.close();
	}

	protected static int getVehiclesType(int entry, int exit, int[] widhtArray) {
		int min = widhtArray[entry];
		for (int i = entry + 1; i <= exit; i++) {
			if (min > widhtArray[i]) {
				min = widhtArray[i];
			}
		}
		return min;
	}
}
