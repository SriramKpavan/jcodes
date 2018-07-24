package com.jda.datastructureprograms;

import com.jda.utility.Utility;

public class AnagramsIn2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		int array[][] = new int[11][50];
		int p, m;
		for(int i =0; i<10; i++) {
			for(int j = i*100; j< (i+1)*100; j++) {
				if(utility.primeNumberCheck(j)) {
					m=0; p=0;
					for(int k = i*100; k<j; k++) {
						String s= Integer.toString(j);
						String t= Integer.toString(k);
						if(utility.primeNumberCheck(k) && utility.anagramCheck(s, t)) {
							array[i][p] = j;
							p++;
							array[i][p] = k;
							p++;
						}
						else if (utility.primeNumberCheck(k) && !(utility.anagramCheck(s, t))) {
							array[10][m] = j;
							m++;
							array[10][m] = k;
							m++;
						}
					}
				}
			}
		}
		for(int i =0; i<11; i++) {
			for(int j=0; j<50; j++) {
				if(array[i][j] == 0)
					System.out.print(" ");
				else
					System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}
