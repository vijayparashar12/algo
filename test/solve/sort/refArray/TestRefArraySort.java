package solve.sort.refArray;

import org.junit.Test;

public class TestRefArraySort {

	@Test
	public void test() {
		int[] a1 = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
		int[] a2 = { 2, 1, 8, 3 };
		int[] sorted = RefArraySort.sort(a1, a2);
		for(int i : sorted){
			System.out.println(i);
		}
	}

}
