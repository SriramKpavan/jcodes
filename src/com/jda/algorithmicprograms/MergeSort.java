package com.jda.algorithmicprograms;

import com.jda.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Give the size of the array");
		int size = utility.takeInputInteger();
		System.out.println("Give the list of strings");
		String[] array = new String[size]; 
		utility.takeInputString();
		for(int i = 0; i<size; i++)
			array[i] = utility.takeInputString();
		mergeSort(array, 0, size - 1);
		for(int k = 0; k<array.length; k++)
			System.out.print(array[k] + " ");
	}
	
	public static void merge(String array[], int l, int m, int r)
	{
	    int i, j, k;
	    int n1 = m - l + 1;
	    int n2 =  r - m;
	 
	    // create temp arrays 
	    String[] left = new String[n1];
	    String[] right = new String[n1];
	 
	    // Copy data to temp arrays left[] and right[] 
	    for (i = 0; i < n1; i++)
	        left[i] = array[l + i];
	    for (j = 0; j < n2; j++)
	        right[j] = array[m + 1+ j];
	 
	    // Merge the temp arrays back into arr[l..r]
	    i = 0; // Initial index of first subarray
	    j = 0; // Initial index of second subarray
	    k = l; // Initial index of merged subarray
	    while (i < n1 && j < n2)
	    {
	        if (left[i].compareTo(right[j])<=0)
	        {
	            array[k] = left[i];
	            i++;
	        }
	        else
	        {
	            array[k] = right[j];
	            j++;
	        }
	        k++;
	    }
	 
	    // Copy the remaining elements of left[], if there are any 
	    while (i < n1)
	    {
	        array[k] = left[i];
	        i++;
	        k++;
	    }
	 
	    // Copy the remaining elements of right[], if there are any
	    while (j < n2)
	    {
	        array[k] = right[j];
	        j++;
	        k++;
	    }
	}
	 
	// l is for left index and r is right index of the sub-array of arr to be sorted 
	public static void mergeSort(String array[], int l, int r)
	{
	    if (l < r)
	    {
	        int m = l+(r-l)/2;
	 
	        // Sort first and second halves
	        mergeSort(array, l, m);
	        mergeSort(array, m+1, r);
	 
	        merge(array, l, m, r);
	    }
	}
}
