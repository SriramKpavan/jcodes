package com.jda.algorithmicprograms;

import java.util.Arrays;

import com.jda.utility.Utility;

public class Generics<T> {

	public static void main(String args[]){
		Utility utility = new Utility();
		System.out.println("Give a number between 1 and 6");
		int num = utility.takeInputInteger();
		System.out.println("Give the size of the array");
		int size = utility.takeInputInteger();
		
		switch(num){
		case 1:
			long startTime1 = System.currentTimeMillis();
			Integer[] arrayInteger = new Integer[size];
			System.out.println("Give the elements of the array");
			for(int i = 0; i < size; i++)
				arrayInteger[i] = utility.takeInputInteger();
			Arrays.sort(arrayInteger);
			System.out.println("Give the number that needs to be searched");
			Integer intToFind = utility.takeInputInteger();
			utility.genBinarySearch(arrayInteger, intToFind);
			long endTime1 = (System.currentTimeMillis() - startTime1)/1000;
			System.out.println("Time elapsed to perform Binary Search for Integer Array = " + endTime1);
			break;
			
		case 2:
			long startTime2 = System.currentTimeMillis();
			String[] arrayString = new String[size];
			System.out.println("Give the elements of the array");
			utility.takeInputString();
			for(int i = 0; i < size; i++)
				arrayString[i] = utility.takeInputString();
			Arrays.sort(arrayString);
			System.out.println("Give the element that needs to be searched");
			String stringToFind = utility.takeInputString();
			utility.genBinarySearch(arrayString, stringToFind);
			long endTime2 = (System.currentTimeMillis() - startTime2)/1000;
			System.out.println("Time elapsed to perform Binary Search for String Array = " + endTime2);
			break;
			
		case 3:
			long startTime3 = System.currentTimeMillis();
			Integer[] arrayIntegerBubSort = new Integer[size];
			System.out.println("Give the elements of the array");
			for(int i = 0; i < size; i++)
				arrayIntegerBubSort[i] = utility.takeInputInteger();
			utility.genBubbleSort(arrayIntegerBubSort);
			long endTime3 = (System.currentTimeMillis() - startTime3)/1000;
			System.out.println("Time elapsed to perform Bubble Sort for Integer Array = " + endTime3);
			break;
			
		case 4:
			long startTime4 = System.currentTimeMillis();
			String[] arrayStringBubSort = new String[size];
			System.out.println("Give the elements of the array");
			utility.takeInputString();
			for(int i = 0; i < size; i++)
				arrayStringBubSort[i] = utility.takeInputString();
			utility.genBubbleSort(arrayStringBubSort);
			long endTime4 = (System.currentTimeMillis() - startTime4)/1000;
			System.out.println("Time elapsed to perform Bubble Sort for String Array = " + endTime4);
			break;
			
		case 5:
			long startTime5 = System.currentTimeMillis();
			Integer[] arrayIntegerInsSort = new Integer[size];
			System.out.println("Give the elements of the array");
			for(int i = 0; i < size; i++)
				arrayIntegerInsSort[i] = utility.takeInputInteger();
			utility.genInsertionSort(arrayIntegerInsSort);
			long endTime5 = (System.currentTimeMillis() - startTime5)/1000;
			System.out.println("Time elapsed to perform Insertion Sort for Integer Array = " + endTime5);
			break;
			
		case 6:
			long startTime6 = System.currentTimeMillis();
			String[] arrayStringInsSort = new String[size];
			System.out.println("Give the elements of the array");
			utility.takeInputString();
			for(int i = 0; i < size; i++)
				arrayStringInsSort[i] = utility.takeInputString();
			utility.genInsertionSort(arrayStringInsSort);
			long endTime6 = (System.currentTimeMillis() - startTime6)/1000;
			System.out.println("Time elapsed to perform Insertion Sort for String Array = " + endTime6);
			break;
	}
		
		
	}
}
