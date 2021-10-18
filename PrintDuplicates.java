package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Set<Integer> pd = new HashSet<Integer>();
		System.out.print("the duplicates are :");
		for (int i = 0; i < arr.length; i++) {
			if (!pd.add(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
