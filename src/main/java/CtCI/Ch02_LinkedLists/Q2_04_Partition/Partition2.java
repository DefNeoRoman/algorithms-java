package CtCI.Ch02_LinkedLists.Q2_04_Partition;

import CtCI.CtCILibrary.LinkedListNode;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%202/Question2_4/QuestionC.java
 * Better space complexity
 */
public class Partition2 {

	public static LinkedListNode partition(LinkedListNode node, int pivot) {
		LinkedListNode head = node;
		LinkedListNode tail = node;

		while (node != null) {
			LinkedListNode next = node.next; // important! otherwise infinite loop
			if (node.data < pivot) {
				// insert at head
				node.next = head;
				head = node;
			} else {
				// insert at tail
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
	}

	public static void main(String[] args) {
		/* Create linked list */
		int[] vals = {1, 3, 7, 5, 2, 9, 4};
		LinkedListNode head = new LinkedListNode(vals[0], null, null);
		LinkedListNode current = head;
		for (int i = 1; i < vals.length; i++) {
			current = new LinkedListNode(vals[i], null, current);
		}
		System.out.println(head.printForward());

		/* Partition */
		LinkedListNode h = partition(head, 5);

		/* Print Result */
		System.out.println(h.printForward());
	}

}
