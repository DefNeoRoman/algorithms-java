package CtCI.Ch02_LinkedLists.Q2_07_Intersection;

import CtCI.CtCILibrary.AssortedMethods;
import CtCI.CtCILibrary.LinkedListNode;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2002.%20Linked%20Lists/Q2_07_Intersection/Question.java
 * Using a set : O(a + b) time, O(a) space
 */
public class QuestionA {

	public static LinkedListNode findIntersection(LinkedListNode list1, LinkedListNode list2) {
		if (list1 == null || list2 == null) return null;

		Set<LinkedListNode> set = new HashSet<>();

		LinkedListNode node = list1;
		while (node != null) {
			set.add(node);
			node = node.next;
		}

		node = list2;
		while (node != null) {
			if (set.contains(node)) {
				return node;
			}
			node = node.next;
		}

		return null;
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
