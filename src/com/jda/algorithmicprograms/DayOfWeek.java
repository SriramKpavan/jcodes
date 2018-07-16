package com.jda.algorithmicprograms;

import com.jda.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Give the day, month and year");
		int date = utility.takeInputInteger();
		int month = utility.takeInputInteger();
		int year = utility.takeInputInteger();
		utility.dayofweek(date, month, year);
	}

	
}
