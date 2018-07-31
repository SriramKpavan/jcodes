package com.jda.utility;

public class Player {
	 Queue<String>queue;
	
	public Player() {
		 queue = new Queue<String>();
		 }
	
	public void  cardQueue(String[] array){
		array = Utility.cardSort(array);
		for(int i =0; i<array.length; i++) 
			queue.enqueue(array[i]);
		}
	
	public Queue<String> getqueue(){
		
		return queue;
		}	
	
	
	public void printQueue(){
		do
			System.out.println(queue.dequeue());
		while(!(queue.isempty()));
		}
	}
