package com.jda.datastructureprograms;

import com.jda.utility.Deque;
import com.jda.utility.Utility;

public class PalindraomeChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Give the string you want to run palindrome check on");
		String pal = utility.takeInputString();
		Deque<Character> deque = new Deque<Character>();
		char[] temp = pal.toLowerCase().toCharArray();
		boolean value = true;
		for(int i =0; i< temp.length; i++) 
			deque.addRear(temp[i]);
		for(int i = 0; i< temp.length/2; i++) {
			if((deque.removeFront()).compareTo(deque.removeRear()) != 0 ) 
				value = false;		
		}
		System.out.println(value);
	}

}
