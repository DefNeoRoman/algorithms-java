package CtCI.Ch02_LinkedLists.Q2_08_Loop_Detection;

import CtCI.CtCILibrary.LinkedListNode;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2002.%20Linked%20Lists/Q2_08_Loop_Detection/Question.java
 * Using a set. O(n) time & O(n) space
 */
public class QuestionA {

	public static LinkedListNode FindBeginning(LinkedListNode head) {
		Set<LinkedListNode> set = new HashSet<>();
		while (head != null) {
			if (set.contains(head)) {
				return head;
			}
			set.add(head);
			head = head.next;
		}
		return null;
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