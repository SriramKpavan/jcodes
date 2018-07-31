package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class CouponNum {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int N =  utility.takeInputInteger();
		int a[] =new int[N];
		int i, count=0, t=0;
		for(int j=0; j<N; j++)
			a[j] = j;
		while(true){
			i = Utility.normalise(N);
			count++;
			System.out.println(i);
			if(i == a[i]){
				a[i] = -1;
				t++;
			}	
			if(t == N){
				System.out.println(count);
				return;
			}
			}
	}
	
	
}
