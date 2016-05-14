package CtCI.Ch02_LinkedLists.Q2_02_Return_Kth_To_Last;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * [Iterative] Using a stack
 * O(n) time & O(k) space complexity
 */
public class SolutionA {

	public static int kthToLast(Node head, int k) {
		Stack<Node> stack = new Stack<>();
		Node current = head;
		while (current != null) {
			stack.push(current);
			current = current.getNext();
		}
		while (k --> 0) {
			stack.pop();
		}
		return stack.peek().getData();
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
