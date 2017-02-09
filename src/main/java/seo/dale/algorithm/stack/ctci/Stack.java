package seo.dale.algorithm.stack.ctci;

import java.util.EmptyStackException;

/**
 * https://youtu.be/wjI1WNcIntg
 */
public class Stack<T> {

	private Node<T> top;

	public boolean isEmpty() {
		return top == null;
	}

	public T peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	public T pop() {
		T data = peek();
		top = top.next;
		return data;
	}

	public void push(T data) {
		Node<T> node = new Node<>(data);
		node.next = top;
		top = node;
	}

	public static class Node<T> {

		T data;
		Node next;

		public Node(T data) {
			this.data = data;
		}

	}

}
