package seo.dale.algorithm.queue.ctci;

/**
 * https://youtu.be/wjI1WNcIntg
 */
public class Queue<T> {

	private Node<T> head;
	private Node<T> tail;

	public boolean isEmpty() {
		return head == null;
	}

	public T peek() {
		return head.data;
	}

	public T remove() {
		T data = peek();
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return data;
	}

	public void add(T data) {
		Node<T> node = new Node<>(data);
		if (tail != null) {
			tail.next = node;
		}
		tail = node;
		if (head == null) {
			head = node;
		}
	}

	public static class Node<T> {

		T data;
		Node next;

		public Node(T data) {
			this.data = data;
		}

	}

}
