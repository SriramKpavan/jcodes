package com.jda.datastructureprograms;

import com.jda.utility.*;

public class PrimeNumbersInRanges {

	static Utility utility = new Utility();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = maxPrimes(1000);
		System.out.println(t);
		int[][] array = new int[10][t];
		int k;
		for(int i = 0; i<10; i++) {
			k = 0;
			for(int j = (i*100); j<=(i+1)*100; j++) {
				if(utility.primeNumberCheck(j)) {
					array[i][k] = j;
					k++;
				}
			}
		}
		for(int i =0; i<10; i++) {
			for(int j = 0; j<t; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}
	
	public static int numOfPrimes(int a, int b) {
		int count = 0;
		for(int i = a; i<b; i++) {
			if(utility.primeNumberCheck(i))
				count++;
		}
		return count;
	}
	
	public static int maxPrimes(int range) {
		int k = range/100;
		int t =0;
		for(int i = 0; i< k; i++) {
			int	temp = numOfPrimes((i*100), ((i+1)*100));
			if(temp > t)
				t = temp;	
			}
		return t;
	}

}
