package com.jda.algorithmicprograms;

import com.jda.utility.Utility;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Give two strings");
		String s = utility.takeInputString();
		String s2 = utility.takeInputString();
		boolean t = utility.anagramCheck(s, s2);
		if(t == true)
			System.out.println("They are anagrams");
		else
			System.out.println("They are not anagrams");
	}
}