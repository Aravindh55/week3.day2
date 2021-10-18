package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List<Integer> listData=new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			listData.add(data[i]);
			
		}
		Collections.sort(listData);
		int size = listData.size();
		
		
		System.out.println("the second largest number is :"+listData.get(size-2));
		
	}

}
