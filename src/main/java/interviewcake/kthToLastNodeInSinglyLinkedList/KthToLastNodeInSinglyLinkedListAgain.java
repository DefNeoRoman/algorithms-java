package interviewcake.kthToLastNodeInSinglyLinkedList;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * https://www.interviewcake.com/question/java/kth-to-last-node-in-singly-linked-list?utm_source=weekly_email
 */
public class KthToLastNodeInSinglyLinkedListAgain {

	@Test
	public void test() {
		LinkedListNode a = new LinkedListNode("Angel Food");
		LinkedListNode b = new LinkedListNode("Bundt");
		LinkedListNode c = new LinkedListNode("Cheese");
		LinkedListNode d = new LinkedListNode("Devil's Food");
		LinkedListNode e = new LinkedListNode("Eccles");

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		assertEquals(c, kthToLastNode2(3, a));
		assertEquals(d, kthToLastNode2(2, a));
		assertEquals(e, kthToLastNode2(1, a));

		assertEquals(c, kthToLastNode(3, a));
		assertEquals(d, kthToLastNode(2, a));
		assertEquals(e, kthToLastNode(1, a));
	}

	// O(n)
	private static LinkedListNode kthToLastNode(int k, LinkedListNode head) {
		LinkedListNode left = head;
		LinkedListNode right = head;

		for (int i = 0; i < k - 1; i++) {
			right = right.next;
		}

		while (right.next != null) {
			left = left.next;
			right = right.next;
		}

		return left;
	}

	// O(n)
	private static LinkedListNode kthToLastNode2(int k, LinkedListNode head) {
		int size = 1;

		LinkedListNode curr = head;
		while (curr.next != null) {
			size++;
			curr = curr.next;
		}
		System.out.println("size : " + size);

		curr = head;
		for (int i = 0; i < size - k; i++) {
			curr = curr.next;
		}

		return curr;
	}

	public static class LinkedListNode {

		public String value;
		public LinkedListNode next;

		public LinkedListNode(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return value;
		}
	}
	
}
