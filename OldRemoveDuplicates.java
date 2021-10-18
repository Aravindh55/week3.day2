package week3.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class OldRemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] charArray = text.split(" ");
		
		Set<String> text2=new LinkedHashSet<String>();
		for (int i = 0; i < charArray.length; i++) {
			text2.add(charArray[i]);
			
		}
		for (String string : text2) {
			
			System.out.print(string+" ");
			
		}

	}

}
