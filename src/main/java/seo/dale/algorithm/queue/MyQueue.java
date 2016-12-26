package seo.dale.algorithm.queue;

import java.util.NoSuchElementException;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2003.%20Stacks%20and%20Queues/Introduction/MyQueue.java
 */
public class MyQueue<T> {

	private static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> head;
	private Node<T> tail;

	public void add(T item) {
		Node<T> node = new Node(item);
		if (tail != null) {
			tail.next = node;
		}
		tail = node;
		if (head == null) {
			head = tail;
		}
	}

	public T remove() {
		T item = peek();
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return item;
	}

	public T peek() {
		if (head == null) {
			throw new NoSuchElementException();
		}
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	}
}
