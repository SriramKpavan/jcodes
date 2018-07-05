package com.jda.utility;

import java.util.Scanner;

public class Utility {

	/*This part of code helps us in avoiding repetition of declaring Scanner in every single class*/
	Scanner scanner;
	public Utility(){
	 scanner = new Scanner(System.in);
	}
	
	/*This function */
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

public double expOf2(double n){
	double exp = Math.pow(2, n);
	return exp;
}

public double harmonicNumber(int n){
	double hN = 0;
	for(int i=1; i<=n; i++)
		hN+= 1/((double)i);
	return hN;
}

public void primeFactors(int n ){
	while(n%2 == 0){
		n= n/2;
		System.out.print(2 + " ");
	}
	for(int i = 3; i <= Math.sqrt(n); i+=2){
		while(n%i == 0){
			n = n/i;
			System.out.print(i + " ");
		}
	}
	if(n>2)
		System.out.println(n);
}

/*To find out if the gambler has won or lost*/
public boolean winsOfGambler(int s, int g){
	
	while(s!=0 || s!=g){
		if(Math.random()<0.5)
			s++;
		else
			s--;
		}
	if(s == g)
		return true;
	else
		return false;
}
}