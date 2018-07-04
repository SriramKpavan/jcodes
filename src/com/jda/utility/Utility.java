package com.jda.utility;

import java.util.Scanner;

public class Utility {

	Scanner scanner;
	public Utility(){
	 scanner = new Scanner(System.in);
	}
	
	public String takeInputString(){
		String name = scanner.nextLine();
		return name;
	}
	
	public int takeInputInteger(){
		int n = scanner.nextInt();
		return n;
	}
	
	public String replaceString(String template, String name){
		template = template.replace("<<UserName>>", name);
		return template;
	}
	
	public int getTailCount(int n){
		int t = 0;
		for(int i=0; i<n; i++){
			if(Math.random()<0.5)
				t++;
		}
		return t;
	}
	
	public float getTailPercent(int t, int n){
		float tFraction = (float) t/n;
		float tPercent = tFraction*100;
		return tPercent;
	}
	
public boolean fourDigitCheck(int n ){
		int div = n/1000;
		if(div>=1 && div<=9)
			return true;
		else
			return false;
	}

public boolean leapYearCheck(int n){
	int remainder = n%4;
	if(remainder==0)
		return true;
	else
		return false;
}
}