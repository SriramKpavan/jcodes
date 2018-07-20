package com.jda.utility;

import com.jda.utility.Node;
import com.jda.utility.LinkedList;

public class Deque<T extends Comparable<T>> {

	LinkedList<T> link = new LinkedList<T>();
	
	public void addRear(T key) {
		link.add(key);
	}
	
	public T removeRear() { 
		return link.remove();	
	}
	
	public T removeFront() {
		Node<T> temp = link.head;
		Node<T> prev = null;
		Node<T> fin = null;
		T key;
		while(temp != null) {
			fin = prev;
			prev = temp;
			temp = temp.next;
		} 
		key = prev.value;
		fin.next = prev.next;
		return key;		
	}
}
