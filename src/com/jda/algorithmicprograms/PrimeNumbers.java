package com.jda.algorithmicprograms;
import com.jda.utility.Utility;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		for(int i=1; i<1000; i++){
			if(utility.primeNumberCheck(i) == true)
				System.out.println(i);
		}
	}
}