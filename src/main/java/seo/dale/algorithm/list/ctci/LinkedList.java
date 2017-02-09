package seo.dale.algorithm.list.ctci;

/**
 * https://youtu.be/njTh_OwMljA
 */
public class LinkedList<T> {

	Node<T> head;

	public void append(T data) {
		if (head == null) {
			head = new Node<>(data);
			return;
		}
		Node<T> current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node<>(data);
	}

	public void prepend(T data) {
		Node<T> newHead = new Node<>(data);
		newHead.next = head;
		head = newHead;
	}

	public void deleteWithValue(T data) {
		if (head == null) {
			return;
		}
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node<T> current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	public static class Node<T> {

		T data;
		Node next;

		public Node(T data) {
			this.data = data;
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node<T> node = head;
		while (node != null) {
			builder.append(node.data);
			builder.append("->");
			node = node.next;
		}
		if (builder.length() > 2) {
			builder.setLength(builder.length() - 2);
		}
		return builder.toString();
	}

}
