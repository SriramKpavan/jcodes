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
		int d0 = Utility.dayofweek(day, month, year);
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
