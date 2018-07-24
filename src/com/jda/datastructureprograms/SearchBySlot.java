package com.jda.datastructureprograms;

import java.io.*;
import java.util.HashMap;

import com.jda.utility.LinkedList;
import com.jda.utility.Utility;

public class SearchBySlot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1022775\\Documents\\Numbers.txt"));
		String s;
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("Give the number you want to search");
		int find = utility.takeInputInteger();
		HashMap<Integer, LinkedList<Integer>> hash = new HashMap<Integer, LinkedList<Integer>>();
		while((s = br.readLine()) != null) {
			String[] temp = s.split(",");
			for(int i = 0; i< 11; i++) {
				LinkedList<Integer> num = new LinkedList<Integer>();
				for(int j = 0; j<temp.length; j++) {
					int t = Integer.parseInt(temp[j]);
					if(t%11 == i) 
						num.orderedAdd(t);	
				}
				hash.put(i, num);
			}	
		}
		int remain = find % 11;
		//System.out.println(hash);
		list = hash.get(remain);
		list.orderedRemoveAt(find);
		hash.put(remain, list);
		for(int i = 0; i<11; i++) {
			System.out.println("When remainder = " + i);
			if(hash.get(i).isEmpty())
				System.out.print("The list is empty");
			else
				hash.get(i).printList();
			System.out.println();
		}
	}
}
