package com.jda.algorithmicprograms;

import java.io.*;
import java.util.Arrays;

import com.jda.utility.Utility;

public class ReadFromFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\1022775\\Documents\\JL.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st, search;
		Utility utility = new Utility();
		search = utility.takeInputString();
		if((st = br.readLine()) != null) {
			String[] s = st.split(","); 
			Arrays.sort(s);
			utility.genBinarySearch(s, search);
		}
	}

}
