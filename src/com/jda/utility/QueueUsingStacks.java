package com.jda.utility;

public class QueueUsingStacks<T extends Comparable<T>>{

	Stack<T> stack = new Stack<T>();
	public void enqueue(T data) {
		stack.push(data);
	}
	
	public T dequeue() {
		T data = stack.pop();
		stack.push(data);
		return stack.pop();
	}
}
