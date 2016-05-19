package seo.dale.algorithm.list.singly2;

public class SinglyLinkedList<T> {

	private Node<T> head;
	private int size;

	public SinglyLinkedList() {
	}

	public void add(T data) {
		if (head == null) {
			head = new Node<>(data);
		} else {
			Node<T> current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new Node<>(data));
		}
		size++;
	}

	public T get(int index) {
		if (index < 0 || index >= size) {
			return null;
		}

		Node<T> current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}

		return current.getData();
	}

	public boolean remove(int index) {
		if (index < 0 || index >= size) {
			return false;
		}

		Node<T> current = head;
		for (int i = 0; i < index  - 1; i++) {
			current = current.getNext();
		}

		current.setNext(current.getNext().getNext());
		size--;

		return true;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node<T> current = head;
		while (current != null) {
			builder.append(current.getData());
			builder.append("->");
			current = current.getNext();
		}
		if (builder.length() > 2) {
			builder.setLength(builder.length() - 2);
		}
		return builder.toString();
	}

	private class Node<T> {

		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
			next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

	}

}
