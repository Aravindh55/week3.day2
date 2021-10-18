package week3.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
		Set<Integer> intersect=new LinkedHashSet<Integer>();
		for (int i = 0; i < array2.length; i++) {
			intersect.add(array2[i]);
			
		}
		System.out.print("the intersecting numbers are:");
		for (int i = 0; i < array2.length; i++) {
			if (intersect.contains(array1[i])) {
				System.out.print(array1[i]+",");
				
			}
			
		}

	}

}
