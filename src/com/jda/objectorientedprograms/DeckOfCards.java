package com.jda.objectorientedprograms;

import com.jda.utility.Utility;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] array = formArray();
		for(int i=0; i<4; i++) {
			System.out.println("Cards received by player " + (i+1) + " :");
			for(int j =0; j<9; j++) {
				System.out.println(array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static String[][] formArray(){
		String[] numOnCard = {"King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen"};
		String[] typeOfCard = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String array[][] = new String[4][9];
		String[] temp = new String[52];
		int k =0, a = 0, b=0;
		for(int i =0; i<4; i++) {
			for(int j=0; j<13; j++) {
					temp[k] = numOnCard[j] + " of " + typeOfCard[i];
					k++;
			}
		}
		k = 0;
		while(k<36) {
			int t = Utility.normalise(51);
			if(b == 9) {
				b = 0;
				a++;
			}
			else if(temp[t] != "0") {
				array[a][b] = temp[t];
				temp[t] = "0";
				b++;
				k++;	
			}
		}
		return array;
	}

}
