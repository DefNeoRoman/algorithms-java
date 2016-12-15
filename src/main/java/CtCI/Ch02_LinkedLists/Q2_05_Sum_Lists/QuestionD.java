package CtCI.Ch02_LinkedLists.Q2_05_Sum_Lists;

import CtCI.CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2002.%20Linked%20Lists/Q2_05_Sum_Lists/QuestionA.java
 * Reverse Order : Recursion
 */
public class QuestionD {

	private static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {
		int length1 = length(l1);
		int length2 = length(l2);

		if (length1 < length2) {
			l1 = padList(l1, length2 - length1);
		} else {
			l2 = padList(l2, length1 - length2);
		}

		PartialSum partialSum = addListsHelper(l1, l2);

		if (partialSum.carry == 1) {
			LinkedListNode prev = new LinkedListNode(1);
			prev.setNext(partialSum.sum);
			partialSum.sum = prev;
		}
		return partialSum.sum;
	}

	private static PartialSum addListsHelper(LinkedListNode l1, LinkedListNode l2) {
		if (l1 == null && l2 == null) {
			PartialSum partialSum = new PartialSum();
			return partialSum;
		}
		PartialSum sum = addListsHelper(l1.next, l2.next);
		int val = sum.carry + l1.data + l2.data;

		LinkedListNode prev = new LinkedListNode(val % 10);
		prev.setNext(sum.sum);
		sum.sum = prev;
		sum.carry = val / 10;
		return sum;
	}

	private static int length(LinkedListNode node) {
		if (node == null) {
			return 0;
		}
		return 1 + length(node.next);
	}


	private static LinkedListNode padList(LinkedListNode node, int size) {
		if (size == 0) {
			return node;
		}
		LinkedListNode prev = new LinkedListNode(0);
		prev.setNext(node);
		return padList(prev, size - 1);
	}


	public static int linkedListToInt(LinkedListNode node) {
		int value = 0;
		while (node != null) {
			value = value * 10 + node.data;
			node = node.next;
		}
		return value;
	}


	@Test
	public void test1() {
		LinkedListNode lA1 = new LinkedListNode(6, null, null);
		LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
		LinkedListNode lA3 = new LinkedListNode(7, null, lA2);

		LinkedListNode lB1 = new LinkedListNode(2, null, null);
		LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
		LinkedListNode lB3 = new LinkedListNode(5, null, lB2);

		LinkedListNode list3 = addLists(lA1, lB1);

		System.out.println("  " + lA1.printForward());
		System.out.println("+ " + lB1.printForward());
		System.out.println("= " + list3.printForward());

		int l1 = linkedListToInt(lA1);
		int l2 = linkedListToInt(lB1);
		int l3 = linkedListToInt(list3);

		System.out.println(l1 + " + " + l2 + " = " + l3);
		assertEquals(l1 + l2, l3);
	}

	@Test
	public void test2() {
		LinkedListNode lA1 = new LinkedListNode(3, null, null);
		LinkedListNode lA2 = new LinkedListNode(1, null, lA1);

		LinkedListNode lB1 = new LinkedListNode(5, null, null);
		LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
		LinkedListNode lB3 = new LinkedListNode(1, null, lB2);

		LinkedListNode list3 = addLists(lA1, lB1);

		System.out.println("  " + lA1.printForward());
		System.out.println("+ " + lB1.printForward());
		System.out.println("= " + list3.printForward());

		int l1 = linkedListToInt(lA1);
		int l2 = linkedListToInt(lB1);
		int l3 = linkedListToInt(list3);

		System.out.println(l1 + " + " + l2 + " = " + l3);
		assertEquals(l1 + l2, l3);
	}

}