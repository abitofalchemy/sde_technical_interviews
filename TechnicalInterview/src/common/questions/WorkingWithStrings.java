package common.questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WorkingWithStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputString = new String("Bibliography");
		char[] charArray = inputString.toCharArray();
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		List<char[]> characterList = Arrays.asList(charArray);
		//Set<Character> characterSet = new HashSet<Character>(characterList);
		//System.out.println(reverseView); // [c, b, a]
		
		
		System.out.println(charArray);
		System.out.println(helloArray);
		
		for (int i = helloArray.length; i>0; i-- ){
			System.out.print(helloArray[i-1]);
		}
		//outputInReverseOrderThisArray(characterList);
		
		
	}

	private static void outputInReverseOrderThisArray(List<char[]> characterList) {
		
		if (characterList.isEmpty()) return;
		
		for ( char[] c : characterList){
			System.out.println(c);
		
		}
		//System.out.println("Size: "+characterList.);
		
		
	}

}
