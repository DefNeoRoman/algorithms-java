package CtCI.Ch02_LinkedLists.Q2_08_Loop_Detection;

import CtCI.CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2002.%20Linked%20Lists/Q2_08_Loop_Detection/Question.java
 * Fast/Slow Runners. O(n) time & O(1) space
 */
public class QuestionB {

	public static LinkedListNode FindBeginning(LinkedListNode head) {
		LinkedListNode slow = head;
		LinkedListNode fast = head;

		// Find meeting point
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}

		// Error check - there is no meeting point, and therefore no loop
		if (fast == null || fast.next == null) {
			return null;
		}

		/* Move slow to Head. Keep fast at Meeting Point. Each are k steps
		/* from the Loop Start. If they move at the same pace, they must
		 * meet at Loop Start. */
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		// Both now point to the start of the loop.
		return fast;
	}

	@Test
	public void test() {
		int list_length = 100;
		int k = 10;

		// Create linked list
		LinkedListNode[] nodes = new LinkedListNode[list_length];
		for (int i = 0; i < list_length; i++) {
			nodes[i] = new LinkedListNode(i, null, i > 0 ? nodes[i - 1] : null);
		}

		// Create loop;
		nodes[list_length - 1].next = nodes[list_length - k];

		for (int i = 0; i < 100; i++) {
			System.out.println(nodes[i].data + " -> " + nodes[i].next.data);
		}

		LinkedListNode loop = FindBeginning(nodes[0]);
		assertEquals(nodes[list_length - k], loop);
		if (loop == null) {
			System.out.println("No Cycle.");
		} else {
			System.out.println("Cycle! : " + loop.data);
		}
	}

}