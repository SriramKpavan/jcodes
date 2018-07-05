package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		int win = 0, lose = 0;
		Utility utility = new Utility();
		System.out.println("Give the value of money the gambler has");
		int $Stake = utility.takeInputInteger();
		System.out.println("Give the value of money he wants to win");
		int $Goal = utility.takeInputInteger();
		System.out.println("Give the number of times the experiment is done");
		int N = utility.takeInputInteger();
		for(int i=0; i<N; i++){
			boolean result = utility.winsOfGambler($Stake, $Goal);
			if(result == true)
				win++;
			else
				lose++;
		}
		float wPercent = ((float)win)/((float)N);
		float lPercent = ((float)lose)/((float)N);
		System.out.println("Number of wins = " + win);
		System.out.println("Win percentage = " + wPercent);
		System.out.println("Lose percentage = " + lPercent);
		

	}
}
