package com.jda.functionalprograms;
import com.jda.utility.Utility;
public class LeapYear {

	public static void main(String args[]){
		Utility utility = new Utility();
		int year = utility.takeInputInteger();
		boolean digitCheck = utility.fourDigitCheck(year);
		boolean leapCheck = utility.leapYearCheck(year);
		if(digitCheck==true){
			if(leapCheck==true)
				System.out.println("It's a leap year");
			else
				System.out.println("Not a leap year");
		}
		else
			System.out.println("Give a valid input");
	}
	
	
}
