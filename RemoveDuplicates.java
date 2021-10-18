package week3.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String company = "PayPal India";
		char[] charArray = company.toCharArray();
		Set<Character> charSet = new HashSet<Character>();
		Set<Character> dupSet = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if (!charSet.add(charArray[i])) {
				dupSet.add(charArray[i]);
			}
			if (dupSet.contains(charArray[i])) {
				charSet.remove(charArray[i]);
			}
		}
		System.out.println("before removing duplicates");
		System.out.println(company);
		System.out.println("after removing the duplicates");
		for (Character character : charSet) {
			if (!charSet.isEmpty()) {
				System.out.print(character);
			} else {
				System.out.println("the charset is empty");
			}
		}

	}

}
