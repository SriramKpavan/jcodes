package com.jda.algorithmicprograms;
import java.util.ArrayList;

import com.jda.utility.Utility;

public class PrimeNumberOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s, n;
		Utility utility = new Utility();
		System.out.println("The prime numbers which are also palindromes are ");
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int j=1; j<1000; j++){
			if( utility.primeNumberCheck(j)){
				a.add(j);
					}
		}
		for(int i=0; i<a.size(); i++){
			s = Integer.toString(a.get(i));
			if(utility.palindromeCheck(s)==true)
				System.out.println(a.get(i));
		}
			System.out.println("The anagram pair prime numbers are ");
			for(int i =0 ; i<a.size(); i++){
				for(int k=0; k<i; k++){
					s = Integer.toString(a.get(i));
					n = Integer.toString(a.get(k));
					if(utility.anagramCheck(s, n))
						System.out.println( a.get(i) + " " + a.get(k));
				}
			}
		}	
	}