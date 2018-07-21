package com.jda.datastructureprograms;

import com.jda.utility.Queue;
import com.jda.utility.Utility;

public class WeekAndWeekDay {
	
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Give the values of month and year");
		int month = utility.takeInputInteger();
		int year = utility.takeInputInteger();
		String months[] = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
		int days = utility.numberOfDays(month, year);
		int d = Utility.dayofweek(1, month, year);
		System.out.println(d);
		int day = 1;
		System.out.println(months[month-1] + " " + year);
		System.out.println(" S  M  T  W  Th F  S ");
		for(int i = 0; i< 6; i++) {
			Queue<Integer> queue = new Queue<Integer>();
			for(int j = 0; j<7; j++) {
				if((i==0 && j<d) || (day>days))
					queue.enqueue(0);
				else {
					queue.enqueue(day);
					day++;
				}
				int temp = queue.dequeue().value;
				if(temp == 0)
					System.out.print("   ");
				else if(temp < 10)
					System.out.print(" " + temp + " ");
				else
					System.out.print(temp + " ");
			}
			System.out.println();
		}
	}
}
