package seo.dale.algorithm.list.singly;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SinglyLinkedList<T> {

	private static Logger logger = Logger.getLogger(SinglyLinkedList.class.getName());

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public SinglyLinkedList() {
	}

	public int size() {
		logger.log(Level.INFO, "size : " + size);
		return size;
	}

	public void print() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node<T> node = head;
		while (node != null) {
			builder.append(node.getData());
			builder.append("->");
			node = node.getNext();
		}
		if (builder.length() > 2) {
			builder.setLength(builder.length() - 2);
		}
		return builder.toString();
	}

	public void addAtTheBeginning(T data) {
		logger.log(Level.INFO, "addAtTheBeginning : " + data);
		if (tail == null) {
			tail = head;
		}
		Node<T> node = new Node<>(data);
		node.setNext(head); // node.next -> head
		head = node;  // head -> node
	}

	public void addAtTheEnd(T data) {
		logger.log(Level.INFO, "addAtTheEnd : " + data);
		Node<T> node = new Node<>(data);
		if (tail != null) {
			tail.setNext(node); // tail.next -> node
		}
		tail = node; // tail -> node
		if (head == null) {
			head = tail;
		}
	}

	public void insertAt(int index, T data) {
		logger.log(Level.INFO, "insert " + data + " at "+ index);
		Node<T> previous = head;
		while (index --> 1) {
			previous = previous.getNext();
			if (previous == null) {
				throw new SinglyLinkedListException("The index can't be greater than the size.");
			}
		}

		Node<T> node = new Node<>(data);
		previous.setNext(node); // previous.next -> node
		node.setNext(previous.getNext()); // node.next -> previous.next
	}

}



class Node<T> {

	private T data;
	private Node<T> next;

	public Node(T data) {
		this.data = data;
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