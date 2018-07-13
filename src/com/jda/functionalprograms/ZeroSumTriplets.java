package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class ZeroSumTriplets {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int N = utility.takeInputInteger();
		int a[] = new int[N];
		int count =0;
		for(int i=0; i<N; i++){
			a[i] = utility.takeInputInteger();
		}
		for(int i=0; i<N; i++){
			for(int j=i; j<N; j++){
				for(int k=j; k<N; k++){
					if( !(i==j || j==k || k==i)){
						if((a[i]+a[j]+a[k]) == 0){
							count++;
							System.out.println(a[i] + " " + a[j]+ " "+ a[k]);
					}
					}
				}
			}
		}
		System.out.println("The number of zero sum triplets " +count);
	}

}
