package com.jda.datastructureprograms;

import com.jda.utility.Queue;
import com.jda.utility.Utility;

public class WeekAndWeekDay {

	public class Weekday{
		String date;
		String currentDay;
		public Weekday next;
		Weekday(int date, int day){
			this.date = Integer.toString(date);
			String days[] = {"S , M , T , W , Th, F, S"};
			this.currentDay = days[day];
		}
	}
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int date = 1;
		int day = Utility.dayofweek(date, month, year);
		int days = utility.numberOfDays(month, year);
		Weekday head;
	}
}
