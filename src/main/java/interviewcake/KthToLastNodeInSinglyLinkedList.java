package interviewcake;

import java.util.Arrays;

/**
 * https://www.interviewcake.com/question/kth-to-last-node-in-singly-linked-list?utm_source=weekly_email
 * 
You have a linked list ↴ and want to find the kkth to last node.
Write a function kth_to_last_node() that takes an integer kk and the head_node of a singly linked list, and returns the kkth to last node in the list.
 */
public class KthToLastNodeInSinglyLinkedList {

	/**
	 * O(n) time, O(1) space

Maintain a kk-wide "block" in one walk down the list.

Walk one pointer kk nodes from the head. Call it right_node.
Put another pointer at the head. Call it left_node.
Walk both pointers, at the same speed, towards the tail. This keeps a distance of kk between them.
When right_node hits the tail, left_node is on the target (since it's kk nodes from the end of the list).

	 */
	public Node kthToLastNode3(int order, Node head) {
		if (order < 1) {
			throw new IllegalArgumentException("Order must be greater than 0");
		}
		
		Node leftNode = head;
		Node rightNode = head;
		
		for (int i = 0; i < order - 1; i++) {
			rightNode = rightNode.next;
			if (rightNode == null) {
				throw new IllegalArgumentException("Order must be less than the lengh.");
			}
		}
		
		while (rightNode.next != null) {
			leftNode = leftNode.next;
			rightNode = rightNode.next;
		}

		return leftNode;
	}
	
	/**
	 * O(n) time, O(1) space

use the length of the list.

walk down the whole list, counting nodes, to get the total list_length.
subtract kk from the list_length to get the distance from the head node to the target node (the kth to last node).
walk that distance from the head to arrive at the target node.

	 */
	public Node kthToLastNode2(int order, Node head) {
		if (order < 1) {
			throw new IllegalArgumentException("Order must be greater than 0");
		}
		
		int length = 0;
		Node node = head;
		while (node != null) {
			length++;
			node = node.next;
		}
		
		int howFarTogo = length - order;
		if (howFarTogo < 0) {
			throw new IllegalArgumentException("Order must be less than the lengh.");
		}
		node = head;
		for (int i = 0; i < howFarTogo; i++) {
			node = node.next;
		}
		
		return node;
	}
	
	/**
	 * O(m * n) time, O(m) space
	 */
	public Node kthToLastNode(int order, Node head) {
		if (order < 1) {
			throw new IllegalArgumentException("Order must be greater than 0");
		}
		
		Node[] temp = new Node[order];
		Node node = head;
		while (node != null) {
			System.out.printf("node : %s / temp : %s\n", node, Arrays.toString(temp));
			for (int i = temp.length - 1; i > 0; i--) {
				temp[i] = temp[i - 1];
			}
			temp[0] = node;
			node = node.next;
		}
		
		return temp[order - 1];
	}
	
	public class Node {
		public Node(String value) {
			this.value = value;
		}
		String value;
		Node next;
		
		@Override
		public String toString() {
			return value;
		}
	}

}
