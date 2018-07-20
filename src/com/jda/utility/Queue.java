package com.jda.utility;

public class Queue<T extends Comparable<T>> {
	
	LinkedList<T> link = new LinkedList<T>();
	Deque<T> deque = new Deque<T>();
	
	public void enqueue(T key) {
		link.add(key);
	}

	public T dequeue() {
		return deque.removeFront();
	}
}
