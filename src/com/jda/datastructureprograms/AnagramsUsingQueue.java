package com.jda.datastructureprograms;

import com.jda.utility.*;

public class AnagramsUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility utility = new Utility();
		Queue<Integer> queue = new Queue<Integer>();
		int counter = 0;
		for(int i = 1 ; i<1000; i++){
			for(int k=0; k<i; k++){
			String	s = Integer.toString(i);
			String	n = Integer.toString(k);
				if(utility.anagramCheck(s, n) && utility.primeNumberCheck(i) && utility.primeNumberCheck(k)) {
					queue.enqueue(k);
					queue.enqueue(i);
					counter++;
				}		
			}
		}
	for(int i =0; i<counter; i++) {
		System.out.print(queue.dequeue() + " " + queue.dequeue());
		System.out.println();
	}
	}
}
