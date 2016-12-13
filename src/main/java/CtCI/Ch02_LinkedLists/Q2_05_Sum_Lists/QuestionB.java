package CtCI.Ch02_LinkedLists.Q2_05_Sum_Lists;

import CtCI.CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2002.%20Linked%20Lists/Q2_05_Sum_Lists/QuestionA.java
 * Recursive
 */
public class QuestionB {

	private static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry) {
		if (l1 == null && l2 == null) {
			if (carry == 1) {
				return new LinkedListNode(1);
			} else {
				return null;
			}
		}
		int sum = carry;
		if (l1 != null) {
			sum += l1.data;
		}
		if (l2 != null) {
			sum += l2.data;
		}
		LinkedListNode result = new LinkedListNode(sum % 10);
		LinkedListNode next = addLists(
				l1 == null ? null : l1.next,
				l2 == null ? null : l2.next,
				sum / 10);
		result.setNext(next);
		return result;
	}

	public static int linkedListToInt(LinkedListNode node) {
		int value = 0;
		if (node.next != null) {
			value = 10 * linkedListToInt(node.next);
		}
		return value + node.data;
	}

	@Test
	public void test1() {
		LinkedListNode lA1 = new LinkedListNode(7, null, null);
		LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
		LinkedListNode lA3 = new LinkedListNode(6, null, lA2);

		LinkedListNode lB1 = new LinkedListNode(5, null, null);
		LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
		LinkedListNode lB3 = new LinkedListNode(2, null, lB2);

		LinkedListNode list3 = addLists(lA1, lB1, 0);

		System.out.println("  " + lA1.printForward());
		System.out.println("+ " + lB1.printForward());
		System.out.println("= " + list3.printForward());

		int l1 = linkedListToInt(lA1);
		int l2 = linkedListToInt(lB1);
		int l3 = linkedListToInt(list3);

		System.out.println(l1 + " + " + l2 + " = " + l3);
		assertEquals(l3, l1 + l2);
	}

	@Test
	public void test2() {
		LinkedListNode lA1 = new LinkedListNode(9, null, null);
		LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
		LinkedListNode lA3 = new LinkedListNode(9, null, lA2);

		LinkedListNode lB1 = new LinkedListNode(1, null, null);

		LinkedListNode list3 = addLists(lA1, lB1, 0);

		System.out.println("  " + lA1.printForward());
		System.out.println("+ " + lB1.printForward());
		System.out.println("= " + list3.printForward());

		int l1 = linkedListToInt(lA1);
		int l2 = linkedListToInt(lB1);
		int l3 = linkedListToInt(list3);

		System.out.println(l1 + " + " + l2 + " = " + l3);
		assertEquals(l3, l1 + l2);
	}
}