package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingElements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Set<Integer> missing = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			missing.add(arr[i]);
		}
		for (int i = 1; i < arr.length; i++) {
			if (!missing.contains(i)) {
				System.out.println("the missing element is :" + i);
			}

		}
	}

}
