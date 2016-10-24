package CtCI.Ch02_LinkedLists.Q2_03_DeleteNode;

import CtCI.CtCILibrary.AssortedMethods;
import CtCI.CtCILibrary.LinkedListNode;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%202/Question2_3/Question.java
 */
public class DeleteNode {

	public static void deleteNode(LinkedListNode node) {
		LinkedListNode next = node.next;
		node.data = next.data;
		node.next = next.next;
	}

	public static void main(String[] args) {
		LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		deleteNode(head.next.next.next.next); // delete node 4
		System.out.println(head.printForward());
	}

}
