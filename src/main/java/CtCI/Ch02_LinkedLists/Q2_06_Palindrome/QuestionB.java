package CtCI.Ch02_LinkedLists.Q2_06_Palindrome;

import CtCI.CtCILibrary.LinkedListNode;
import org.junit.Test;

import java.util.Stack;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2002.%20Linked%20Lists/Q2_06_Palindrome/QuestionA.java
 * Stack with fast, slow runner : O(n)
 */
public class QuestionB {

	public static boolean isPalindrome(LinkedListNode node) {
		LinkedListNode fast = node;
		LinkedListNode slow = node;

		Stack<Integer> stack = new Stack<>();
		while (fast != null && fast.next != null) {
			stack.push(slow.data);
			fast = fast.next.next; // moving at 2x speed
			slow = slow.next;
		}
//		System.out.println(stack);
		if (fast != null) {
			slow = slow.next;
		}
		while (slow != null) {
			if (stack.pop().intValue() != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
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
		System.out.println(isPalindrome(head));

		nodes[length - 2].data = 9; // Uncomment to ruin palindrome
		System.out.println(head.printForward());
		System.out.println(isPalindrome(head));
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
		System.out.println(isPalindrome(head));

		nodes[length - 2].data = 9; // Uncomment to ruin palindrome
		System.out.println(head.printForward());
		System.out.println(isPalindrome(head));
	}

}