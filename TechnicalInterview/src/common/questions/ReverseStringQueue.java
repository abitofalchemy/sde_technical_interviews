package common.questions;

import java.util.Scanner;


public class ReverseStringQueue {
	/** 
	 * ReverseStringQueue printers a list of words in reverse order
	 *   as entered on the command line.
	 *   Uses a generic list based queue
	 *   
	 * @param args list words 
	 **/
	
	public static void main(String[] args) {
		System.out.println("[ ReverseStringQueue ]");
		Scanner input = new Scanner(System.in);  // cli input
        GenericQueue<String> queue = new GenericQueue<String>();
        System.out.print("Enter some words: ");
        String wordsLine = input.nextLine();
        String[] words  = wordsLine.split(" ");//split the words separated by space
        for(String word: words){
            queue.enqueueFirst(word);//add one word at a time
        }
        System.out.println(queue);
	}

}
