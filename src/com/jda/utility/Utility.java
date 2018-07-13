package com.jda.utility;

import java.util.Scanner;



public class Utility {

	/*
	 * This part of code helps us in avoiding repetition of declaring Scanner in
	 * every single class
	 */
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	/* This function */
	public String takeInputString() {
		String name = scanner.nextLine();
		return name;
	}

	public int takeInputInteger() {
		int n = scanner.nextInt();
		return n;
	}

	public String replaceString(String template, String name) {
		template = template.replace("<<UserName>>", name);
		return template;
	}

	public int getTailCount(int n) {
		int t = 0;
		for (int i = 0; i < n; i++) {
			if (Math.random() < 0.5)
				t++;
		}
		return t;
	}

	public float getTailPercent(int t, int n) {
		float tFraction = (float) t / n;
		float tPercent = tFraction * 100;
		return tPercent;
	}

	public boolean fourDigitCheck(int n) {
		int div = n / 1000;
		if (div >= 1 && div <= 9)
			return true;
		else
			return false;
	}

	public boolean leapYearCheck(int n) {
		if (n%4 == 0){
			if(n%100 == 0){
				if(n%400 == 0)
					return true;
				else
					return false;
			}
			else
				return true;
		}
		else
			return false;
	}

	/*To find out the nth power of 2*/
	public double expOf2(double n) {
		double exp = Math.pow(2, n);
		return exp;
	}

	/*To find out the nth harmonic number*/
	public double harmonicNumber(int n) {
		double hN = 0;
		for (int i = 1; i <= n; i++)
			hN += 1 / ((double) i);
		return hN;
	}

	/*To find out the prime factors of a number*/
	public void primeFactors(int n) {
		while (n % 2 == 0) {
			n = n / 2;
			System.out.print(2 + " ");
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				n = n / i;
				System.out.print(i + " ");
			}
		}
		if (n > 2)
			System.out.println(n);
	}

	/* To find out if the gambler has won or lost */
	/**
	 * @param s
	 * @param g
	 * @return
	 */
	public boolean winsOfGambler(int s, int g) {

		while (s> 0 && s< g) {
			if (Math.random() < 0.5) 
				s++;
			else
				s--;
		}
		if (s == g)
			return true;
		else
			return false;
	}
	
	/*To find out the distance between origin and a point (x,y)*/
	public double distance(int x, int y){
		int a = x*x, b = y*y;
		double k = Math.pow((a+b), 0.5);
		return k;
	}
		 
	// To create a stopwatch
	public double getElapsedTime(){
		double startTime= System.currentTimeMillis();
	   for(int i=0; i<1000000; i++){
	   	i++;
	   }
	   double elapsedTime = System.currentTimeMillis() -  startTime;
	   return elapsedTime;
	}
	
	//To check if string x and y are anagrams
	public boolean anagramCheck(String x, String y){
		char s1[], s2[], temp;
		x =  x.replaceAll(" ", "");
		y =  y.replaceAll(" ", "");
		int n1 = x.length(), n2 = y.length(), k=0;
		if(n1 == n2){
			s1 = x.toCharArray();
			s2 = y.toCharArray();
			
			for(int i= 0; i<n1; i++){
				for(int j=0; j<n1-i-1; j++){
					if(s1[j]>s1[j+1]){
						temp = s1[j+1];
						s1[j+1] = s1[j];
						s1[j] = temp;
						}
					if(s2[j]>s2[j+1]){
						temp = s2[j+1];
						s2[j+1] = s2[j];
						s2[j] = temp;
						}
				}
			}
			for(int a = 0; a<n1; a++){
				if(s1[a] == s2[a])
					k++;
				else
					break;
			}
			if(k == n1)
				return true;
			else
				return false;
		}
		else
			return false;
		 }
	
	//To check if the number x is prime or not
	public boolean primeNumberCheck(int x){
		int t = 0;
		for(int i=3; i<=Math.sqrt(x); i+=2){
			if(x%i == 0){
				t++;
				break;
			}
		}
		if( (t>0) || (x%2 == 0))
			return false;
		else
			return true;
	}
	
	//To check if the string x is palindrome
	public boolean palindromeCheck(String x){
		int n = x.length();
		x= x.toLowerCase();
			for(int i=0; i<n; i++){
				if(x.charAt(i) != x.charAt(n-1-i))
					return false;
			}
			return true;
	}
	
	//Generic binary search method so that we can use it for integer and string
	public  < T extends Comparable <T> > void genBinarySearch ( T[] array, T  toFind ){
		
		int left = 0, right = array.length;
		while(left <= right){
			int mid = left + (right-left)/2;
			if(array[mid].compareTo(toFind) == 0){
				System.out.println("Element found");
				return;
			}
			if(array[mid].compareTo(toFind)>0)
				right = mid - 1;
			else
				left = mid+1;
		}
		System.out.println("Element not found");
		return;
	}
	
	//Generic method to insertion sort any type of array
public <T extends Comparable<T>> void genInsertionSort(T[] array){
	for(int i=1; i<array.length; i++){
		T key = array[i];
		int j = i-1;
		while(j>=0 && array[j].compareTo(key) > 0){
			array[j+1] = array[j];
			j = j-1;
		}
		array[j+1] = key;
	}
	for(int i = 0; i<array.length; i++)
		System.out.print(array[i] + " ");
}

//Generic method to run bubble sort on any type of array
public <T extends Comparable<T>> void genBubbleSort(T[] array){
	
	for(int i = 0; i < array.length; i++){
		for(int j= i; j < array.length; j++){
			if(array[i].compareTo(array[j]) > 0){
				T t = array[i];
				array[i] = array[j];
				array[j] = t;
			}
		}
	}
	
	for(int i = 0; i<array.length; i++)
		System.out.print(array[i] + " ");
}
	
int n = 0, t =0;
public void minimumNotes(int ch, int a[]){
	int k = a.length, buff = 0;
	buff = ch/a[0];
	n+= buff;
	ch = ch%a[0];
	System.out.println("Number of " + a[0] + " notes = " + buff);
	int temp = a[0];
	for(int i=0; i<k-1; i++)
		a[i] = a[i+1];
	a[k-1] = temp;
	t++;
	if(t<7)
		minimumNotes(ch, a);	
	else
		System.out.print(n);	
}
}