package com.jda.algorithmicprograms;

import com.jda.utility.Utility;

public class FindYourNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		int N = utility.takeInputInteger();
		int n = (int) Math.ceil((Math.log(N))/(Math.log(2)));
		//System.out.println(n);
		int l = 0, r = N-1, mid = 0, i;
		String reply;
		utility.takeInputString();
		for(i =0; i<n; i++){
			if((r - l) > 1){
				mid = l + (r - l)/2;
				System.out.println("Is the number between " + l + " and " + mid + "?");
				//System.out.println(i);
				reply = utility.takeInputString();
				if(reply.equalsIgnoreCase("true"))
					r = mid -1;
				else if(reply.equalsIgnoreCase("false"))
					l = mid + 1;
			}
			else{
				System.out.println("Is "+ l + " the number?");
				reply = utility.takeInputString();
				if(reply.equalsIgnoreCase("true"))
					System.out.println(l);
				else
					System.out.println(r);
				break;
			}	
		}
		System.out.println("The number of questions asked = " + i);
	}

}
