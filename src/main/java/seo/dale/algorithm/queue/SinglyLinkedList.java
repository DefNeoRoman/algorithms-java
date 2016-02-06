package seo.dale.algorithm.queue;

public class SinglyLinkedList {

	private Node head;
	private Node tail;
	
	public SinglyLinkedList() {
	}
	
	public void insert(int num) {
		Node node = new Node();
		node.data = num;
		node.next = null;
		
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;	
		}
	}
	
	public int delete() {
		if (head == null) {
			throw new RuntimeException("This linked list is empty.");
		}
		
		int num = head.data;
		head = head.next;

		return num;
	}
	
	public class Node {
		public int data;
		public Node next;
	}

	public void print() {
		while (head != null) {
			System.out.println("> " + head.data + " is left.");
			head = head.next;
		}
	}
	
	public void print2() {
		printRecrusivly(head);
	}
	
	private void printRecrusivly(Node node) {
		if (node == null) {
			return;
		}
		
		System.out.println("> " + node.data + " is left.");
		printRecrusivly(node.next);
	}
	
	public void printBackward() {
		printBackwardRecrusivly(head);
	}
	
	private void printBackwardRecrusivly(Node node) {
		if (node == null) {
			return;
		}
		
		printRecrusivly(node.next);
		System.out.println("> " + node.data + " is left.");
	}

}
