package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class Replace {

	public static void main(String[] args) {
		
		String template = "Hello <<UserName>>, How re you?";
		System.out.println("Enter UserName");
		Utility utility =  new Utility();
		String name = utility.takeInputString();
		if(name.length()>2){
			template = utility.replaceString(template, name);
			System.out.println(template);
		}
		else
			System.out.println("Give valid input");
		
	}
	}