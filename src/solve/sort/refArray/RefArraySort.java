package solve.sort.refArray;

import java.util.LinkedHashMap;
import java.util.Map;

public class RefArraySort {
	private static int[] inputSet;
	private static Map<Integer, Integer> scoreMap;

	public static int[] sort(int[] input, int[] ref) {
		inputSet = input;
		scoreMap = new LinkedHashMap<Integer, Integer>();
		int weight = ref.length;
		for (int i : ref) {
			scoreMap.put(i, weight--);
		}
		int mid = inputSet.length / 2;
		return merge(divide(0, mid), divide(mid + 1, inputSet.length - 1));
	}

	private static int[] divide(int left, int right) {
		if (right - left == 0) {
			return new int[] { inputSet[left] };
		} else if (right - left == 1) {
			return merge(new int[] { inputSet[left] },
					new int[] { inputSet[right] });
		}
		int mid = (left + right) / 2;
		return merge(divide(left, mid), divide(mid + 1, right));
	}

	private static int[] merge(int[] left, int[] right) {
		int[] sorted = new int[left.length + right.length];
		int j = 0, k = 0;
		for (int i = 0; i < left.length + right.length; i++) {
			if (j >= left.length) {
				sorted[i] = right[k];
				k++;
			} else if (k >= right.length) {
				sorted[i] = left[j];
				j++;
			} else if (scoreMap.containsKey(left[j])
					&& scoreMap.containsKey(right[k])) {
				if (scoreMap.get(left[j]) > scoreMap.get(right[k])) {
					sorted[i] = left[j];
					if (j < left.length) {
						j++;
					}
				} else {
					sorted[i] = right[k];
					if (k < right.length) {
						k++;
					}
				}
			} else if (scoreMap.containsKey(left[j])
					&& !scoreMap.containsKey(right[k])) {
				sorted[i] = left[j];
				if (j < left.length) {
					j++;
				}
			} else if (!scoreMap.containsKey(left[j])
					&& scoreMap.containsKey(right[k])) {
				sorted[i] = right[k];
				if (k < right.length) {
					k++;
				}
			} else if (left[j] >= right[k]) {
				sorted[i] = right[k];
				if (k < right.length) {
					k++;
				}
			} else {
				sorted[i] = left[j];
				if (j < left.length) {
					j++;
				}
			}
		}
		return sorted;
	}
}