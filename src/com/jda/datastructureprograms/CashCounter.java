package com.jda.datastructureprograms;

import com.jda.utility.*;

public class CashCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		System.out.println("Enter the amount you initially have");
		int balance = utility.takeInputInteger();
		System.out.println("Enter the number of people in the queue");
		int transactions = utility.takeInputInteger();
		Queue<Integer> queue = new Queue<Integer>();
		int[] array = new int[transactions];
		for(int i = 0; i< transactions; i++) {
			System.out.println("Give 1 for deposit and 0 for withdrawal");
			array[i] = utility.takeInputInteger();
			System.out.println("The amount to be transacted");
			int temp = utility.takeInputInteger();
			queue.enqueue(temp);
			 int temp2 = queue.dequeue(); 
				if(array[i] == 1)
					balance+= temp2;
				else if(array[i] == 0 && balance < temp2) {
					System.out.println("Not enough money");
					return;
				}	
				else if(array[i] == 0)
					balance-= temp2;
		}
		System.out.println("The remaining balance is " + balance);
	}
}
