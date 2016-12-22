package CtCI.Ch02_LinkedLists.Q2_07_Intersection;

import CtCI.CtCILibrary.AssortedMethods;
import CtCI.CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2002.%20Linked%20Lists/Q2_07_Intersection/Question.java
 * Using a set : O(a + b) time, O(1) space
 */
public class QuestionB {

	public static LinkedListNode findIntersection(LinkedListNode list1, LinkedListNode list2) {
		if (list1 == null || list2 == null) return null;

		TailAndLength tailAndLength1 = getTailAndLength(list1);
		TailAndLength tailAndLength2 = getTailAndLength(list2);

		if (tailAndLength1.tail != tailAndLength2.tail) {
			return null;
		}

		LinkedListNode shorter = tailAndLength1.length < tailAndLength2.length ? list1 : list2;
		LinkedListNode longer = tailAndLength1.length < tailAndLength2.length ? list2 : list1;

		longer = getKthNode(longer, Math.abs(tailAndLength1.length - tailAndLength2.length));

		while (shorter != longer) {
			shorter = shorter.next;
			longer = longer.next;
		}

		return shorter;
	}

	private static TailAndLength getTailAndLength(LinkedListNode head) {
		if (head.next == null) {
			return new TailAndLength(head, 1);
		}
		TailAndLength nextNode = getTailAndLength(head.next);
		return new TailAndLength(nextNode.tail, 1 + nextNode.length);
	}

	private static LinkedListNode getKthNode(LinkedListNode head, int k) {
		if (k == 0) {
			return head;
		}
		return getKthNode(head.next, k - 1);
	}

	static class TailAndLength {
		LinkedListNode tail;
		int length;

		public TailAndLength(LinkedListNode tail, int length) {
			this.tail = tail;
			this.length = length;
		}
	}

	@Test
	public void test() {
		/* Create linked list */
		int[] vals = {-1, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8};
		LinkedListNode list1 = AssortedMethods.createLinkedListFromArray(vals);

		int[] vals2 = {12, 14, 15};
		LinkedListNode list2 = AssortedMethods.createLinkedListFromArray(vals2);

		list2.next.next = list1.next.next.next.next;

		System.out.println(list1.printForward());
		System.out.println(list2.printForward());


		LinkedListNode intersection = findIntersection(list1, list2);

		System.out.println(intersection.printForward());

		assertEquals("2->3->4->5->6->7->8", intersection.printForward());
	}

}
