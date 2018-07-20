package com.jda.utility;

public class Node<S> {

	public S value;
	public Node<S> next;

	Node(S data) {
		value = data;
		next = null;
	}
}
