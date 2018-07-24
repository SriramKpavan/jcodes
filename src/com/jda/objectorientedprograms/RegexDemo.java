package com.jda.objectorientedprograms;

import java.util.regex.*;

import com.jda.utility.*;

public class RegexDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		String name, fullName, num, date;
		String line = "Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91­xxxxxxxxxx.Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016";
		System.out.println("Give your name");
		name = utility.takeInputString();
		System.out.println("Give your fullname");
		fullName = utility.takeInputString();
		System.out.println("Give your phone number");
		num = utility.takeInputString();
		System.out.println("Give the date");
		date = utility.takeInputString();
		Deque<String> replace = new Deque<String>();
		replace.addRear("<<name>>");
		replace.addRear("<<full name>>");
		replace.addRear("xxxxxxxxxx");
		replace.addRear("01/01/2016");
		replace.addRear(date);
		replace.addRear(num);
		replace.addRear(fullName);
		replace.addRear(name);
		
		while(!(replace.isEmpty())) {
			Pattern p = Pattern.compile(replace.removeFront());
			Matcher m = p.matcher(line);
			line = m.replaceFirst(replace.removeRear());
			
		}
		System.out.println(line);
		
	}

}
