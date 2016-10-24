package CtCI.Ch02_LinkedLists.Q2_04_Partition;

import CtCI.CtCILibrary.LinkedListNode;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%202/Question2_4/Question.java
 */
public class Partition {

	public static LinkedListNode partition(LinkedListNode node, int pivot) {
		LinkedListNode lessHead = new LinkedListNode();
		LinkedListNode moreHead = new LinkedListNode();

		LinkedListNode lessTail = lessHead;
		LinkedListNode moreTail = moreHead;

		while (node != null) {
			if (node.data < pivot) {
				lessTail.next = node;
				lessTail = lessTail.next;
			} else {
				moreTail.next = node;
				moreTail = moreTail.next;
			}
			node = node.next;
		}

		lessTail.next = null;
		moreTail.next = null;

//		System.out.println(lessHead.printForward());
//		System.out.println(moreHead.printForward());

		lessTail.next = moreHead.next;
		return lessHead.next;
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
