package CtCI.Ch02.LinkedLists.Q2_01_Remove_Dups;

import CtCI.CtCILibrary.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionBTest {
	
	@Test
	public void testDeleteDups() throws Exception {
		LinkedListNode head = new LinkedListNode(0, null, null);
		LinkedListNode current = head;
		for (int i = 1; i < 10; i++) {
			LinkedListNode next = new LinkedListNode((int) (Math.random() * 5), null, null);
			current.setNext(next);
			next.setPrevious(current);
			current = next;
		}
		System.out.println(head.printForward());
		SolutionB.deleteDups(head);
		System.out.println(head.printForward());
	}

}