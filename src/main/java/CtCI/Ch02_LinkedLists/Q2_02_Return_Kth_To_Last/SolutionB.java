package CtCI.Ch02_LinkedLists.Q2_02_Return_Kth_To_Last;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * [Iterative] Keeping the distance between the previous and current nodes.
 * O(n) time & O(1) space complexity
 */
public class SolutionB {

	public static int kthToLast(Node head, int k) {
		Node previous = head;
		Node current = head;
		// Advance the current k + 1 times
		while (k --> -1) {
			current = current.getNext();
		}
		// Advance with the same pace
		while (current != null) {
			current = current.getNext();
			previous = previous.getNext();
		}
		return previous.getData();
	}

	@Test
	public void test() {
		Node head = new Node(0);
		Node current = head;
		for (int i = 1; i < 10; i++) {
			Node node = new Node(i);
			current.setNext(node);
			current = node;
		}

		System.out.println(head);

		assertEquals(9, kthToLast(head, 0));
		assertEquals(6, kthToLast(head, 3));
		assertEquals(2, kthToLast(head, 7));
	}

}
