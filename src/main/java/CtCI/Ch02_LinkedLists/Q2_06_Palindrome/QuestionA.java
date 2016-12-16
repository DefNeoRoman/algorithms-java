package CtCI.Ch02_LinkedLists.Q2_06_Palindrome;

import CtCI.CtCILibrary.LinkedListNode;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2002.%20Linked%20Lists/Q2_06_Palindrome/QuestionA.java
 * Stack with length : O(n)
 */
public class QuestionA {

	public static boolean isPalindrome(LinkedListNode node) {
		Stack<Integer> stack = new Stack<>();
		int length = length(node);
		for (int i = length / 2; i > 0; i--) {
			stack.push(node.data);
			node = node.next;
		}
//		System.out.println(stack);
		if ((length & 1) == 1) {
			node = node.next;
		}
		for (int i = length / 2; i > 0; i--) {
			if (stack.pop().intValue() != node.data) {
				return false;
			}
			node = node.next;
		}
		return true;
	}

	private static int length(LinkedListNode node) {
		if (node == null) {
			return 0;
		}
		return 1 + length(node.next);
	}

	@Test
	public void test1() {
		int length = 9;
		LinkedListNode[] nodes = new LinkedListNode[length];
		for (int i = 0; i < length; i++) {
			nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
		}

		for (int i = 0; i < length; i++) {
			if (i < length - 1) {
				nodes[i].setNext(nodes[i + 1]);
			}
			if (i > 0) {
				nodes[i].setPrevious(nodes[i - 1]);
			}
		}
		LinkedListNode head = nodes[0];
		System.out.println(head.printForward());
		assertTrue(isPalindrome(head));

		nodes[length - 2].data = 9; // Uncomment to ruin palindrome
		System.out.println(head.printForward());
		assertFalse(isPalindrome(head));
	}

	@Test
	public void test2() {
		int length = 10;
		LinkedListNode[] nodes = new LinkedListNode[length];
		for (int i = 0; i < length; i++) {
			nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
		}

		for (int i = 0; i < length; i++) {
			if (i < length - 1) {
				nodes[i].setNext(nodes[i + 1]);
			}
			if (i > 0) {
				nodes[i].setPrevious(nodes[i - 1]);
			}
		}
		LinkedListNode head = nodes[0];
		System.out.println(head.printForward());
		assertTrue(isPalindrome(head));

		nodes[length - 2].data = 9; // Uncomment to ruin palindrome
		System.out.println(head.printForward());
		assertFalse(isPalindrome(head));
	}

}