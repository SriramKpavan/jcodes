package com.jda.objectorientedprograms;

import java.util.LinkedList;
import java.util.Queue;

import com.jda.utility.Player;


public class PlayerOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] array = DeckOfCards.formArray();
		Player player;
		Queue<Player> players = new LinkedList<>();
		for(int i =0 ; i<4; i++) {
			String[] temp  = new String[9];
			player = new Player();
			for(int j=0; j<9; j++) 
				temp[j] = array[i][j];
			player.cardQueue(temp);
			players.add(player);
		}	
		
		for(int i = 0; i<4; i++) {
			System.out.println("Cards of player " +(i+1) + " :");
			player = players.remove();
			player.printQueue();
			System.out.println();
		}
	}

	
}
