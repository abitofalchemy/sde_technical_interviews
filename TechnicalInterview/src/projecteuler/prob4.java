package projecteuler;

import common.questions.GenericQueue;

public class prob4 {
	/**
	 * 
	 	A palindromic number reads the same both ways. The largest palindrome 
	 	made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 
	 	Find the largest palindrome made from the product of two 3-digit numbers.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// the largest palindrome from the product of two numbers
		
		int number = 0;
		boolean isPalindrome = false;
//		if ( isProductAPalindrome(9009)){
//			System.out.println(number+" is a palindrome.");
//			//break;
//		} else System.out.println("Not");
		
		for (int i = 999; i>0; --i){
			//System.out.println(i+" "+number);
			for (int j=999; j>0; --j){
				number = j * i;
				//System.out.println(i+" "+number);
	
				if ( isProductAPalindrome(number)){
					System.out.println(i+"x"+j+": "+number+" is a palindrome.");
					isPalindrome = true;
					break;
				} //else System.out.println("Not");
				
			}
//			if (isPalindrome)
//				break;
		}
	}

	private static boolean isProductAPalindrome(int intNumber) {
		char[] chars = ("" + intNumber).toCharArray();
		
		//System.out.println(chars.length);
		
		GenericQueue<Character> queueF = new GenericQueue<Character>();
		GenericQueue<Character> queueS = new GenericQueue<Character>();
		if ( chars.length % 2 == 0) {
			//System.out.println("divide in half");
	        for(int i = 0; i< chars.length/2; i++){
	        	
	            queueF.enqueueFirst(chars[i]);//add one word at a time
	        }
	        for(int i = chars.length/2; i< chars.length; i++){
	            queueS.enqueue(chars[i]);//add one word at a time
	        }
	        //System.out.println(queueF.getSize());
	        //System.out.println(queueS);
	        if (compareQueues(queueF, queueS))
	        	return true;
	        else
	        	return false;
		} else /* odd number of numbers */ {
			// divide in half
	        for(int i = 0; i< (int) Math.floor(chars.length/2); i++){
	            queueF.enqueueFirst(chars[i]);//add one word at a time
	        }
	        for(int i = (int) Math.ceil(chars.length/2); i< chars.length; i++){
	            queueS.enqueue(chars[i]);//add one word at a time
	        }
	        if (queueF == queueS)
	        	return true;
	        else
	        	return false;
		}
		
	}

	private static boolean compareQueues(GenericQueue<Character> queueF,
			GenericQueue<Character> queueS) {
		
		boolean retBool = false;
		int siz = queueF.getSize();
		
		for (int i=0;i<siz; i++){
			if (queueF.dequeue().equals(queueS.dequeue())){
				retBool = true;
			}else {
				retBool = false;
				break;
			}
			
		}
		
		return retBool;
		
	}
}
