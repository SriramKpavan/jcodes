package com.jda.datastructureprograms;

import com.jda.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Give the month and year");
		int month = utility.takeInputInteger();
		int year = utility.takeInputInteger();
		int day = 1;
		int y0 = year - ((14 - month)/12);
		int x = y0 + (y0/4) - (y0/100) + (y0/400);
		int m0 = month + (12 *((14-month)/12)) - 2 ;
		int d0 = (day + x + ((31*m0)/12)) %7;
		System.out.println(d0);
		int d1 = utility.numberOfDays(month, year);
		int[][] array = new int[6][7];
		String monthArray[] = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };
		System.out.println(monthArray[month-1] + " " + year);
		System.out.println(" S  M  T  W  Th F  S");
		for(int i = 0; i< 6; i++) {
			for(int j = 0; j<7; j++) {
				if((i == 0 && j < d0) ||(day>d1))
					array[i][j] = 0;
				else {
					array[i][j] = day;
					day++;
				}
				if(array[i][j] == 0)
					System.out.print("  " + " ");
				else if(array[i][j]< 10)
					System.out.print(" " + array[i][j] + " ");
				else
					System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
