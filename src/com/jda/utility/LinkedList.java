package com.jda.utility;

public class LinkedList<T extends Comparable<T>> {

	public Node<T> head = null;

	public static class Node<S> {
		public S value;
		public Node<S> next;

		Node(S data) {
			value = data;
			next = null;
		}
	}

	public T remove() {
		Node<T> temp = head;
		if (temp != null) {
			head = head.next;
			return temp.value;
		} else {
			temp = null;
			return null;
		}
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public int size() {
		int count = 0;
		Node<T> temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public T peak() {
		return head.value;
	}

	public void removeAt(T key) {
		Node<T> temp = head;
		Node<T> prev = null;

		if (temp != null && ((temp.value).compareTo(key) == 0)) {
			head = temp.next;
			return;
		}
		while (temp != null && ((temp.value).compareTo(key) != 0)) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null)
			add(key);
		else
			prev.next = temp.next;
	}
	
	public void orderedRemoveAt(T key) {
		Node<T> temp = head;
		Node<T> prev = null;

		if (temp != null && ((temp.value).compareTo(key) == 0)) {
			head = temp.next;
			return;
		}
		while (temp != null && ((temp.value).compareTo(key) != 0)) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null)
			orderedAdd(key);
		else
			prev.next = temp.next;
	}

	public void add(T data) {
		Node<T> newnode = new Node<T>(data);
		newnode.next = head;
		head = newnode;
	}

	public void orderedAdd(T key) {
		Node<T> temp = head;
		Node<T> prev = null;

		while (temp != null && (key).compareTo(temp.value) <= 0) {
			prev = temp;
			temp = temp.next;
		}
		
		if (temp == head)
			add(key);
		else {
			if (temp == null) {
				Node<T> newnode = new Node<T>(key);
				prev.next = newnode;
				newnode.next = null;
			} 
			else {
				Node<T> newnode = new Node<T>(key);
				newnode.next = temp;
				prev.next = newnode;
			}
		}
	}

	public void printList() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
}