package com.jda.datastructureprograms;

import com.jda.utility.Utility;

public class BTSNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Give the number of testcases");
		int tcases = utility.takeInputInteger();
		System.out.println("Give the values");
		while(tcases > 0) {
			int num = utility.takeInputInteger();
			System.out.println("The number of binary search trees possible for " + num + " is " + catalan(num));
		}
	}

	public static long catalan(int n) {
		// TODO Auto-generated method stub
		if(n <=1)
			return 1;
		long result = 0;
		for(int i =0; i<n; i++)
			result += catalan(i)*catalan(n-i-1);
		return result;
	}
}
