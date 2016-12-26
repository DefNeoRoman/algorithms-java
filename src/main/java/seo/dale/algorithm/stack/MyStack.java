package seo.dale.algorithm.stack;

import java.util.EmptyStackException;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2003.%20Stacks%20and%20Queues/Introduction/MyStack.java
 */
public class MyStack<T> {

	private static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> top;

	public void push(T item) {
		Node<T> node =  new Node<>(item);
		node.next = top;
		top = node;
	}

	public T pop() {
		T item = peek();
		top = top.next;
		return item;
	}

	public T peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

}
