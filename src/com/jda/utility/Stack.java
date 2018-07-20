package com.jda.utility;

public class Stack<T extends Comparable<T>> {

	LinkedList<T> link = new LinkedList<T>();
	
	public void push(T key) {
		link.add(key);
	}
	
	public T pop() {
		return link.remove();
	}
	
	public boolean isEmpty() {
		boolean k = link.isEmpty();
		return k;
	}
}
