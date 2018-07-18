package com.jda.datastructureprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

import com.jda.utility.LinkedList;
import com.jda.utility.Utility;

public class OrderedList {

	public static void main(String args[]) throws Exception
	{
	Utility utility = new Utility();
	String s;
	int[] array;
	File file = new File("C:\\Users\\1022775\\Documents\\Numbers.txt");
	BufferedReader br = new BufferedReader(new FileReader(file));
	LinkedList<Integer> num = new LinkedList<Integer>();
	System.out.println("Give the number you want to search");
	int find = utility.takeInputInteger();
	while((s = br.readLine()) != null) {
		String[] temp = s.split(",");
		for(int i = 0; i< temp.length; i++)
			num.orderedAdd(Integer.parseInt(temp[i]));
	}
	num.orderedRemoveAt(find);
	num.printList();
	}
}
