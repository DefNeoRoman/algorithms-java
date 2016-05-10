package CtCI.Ch02_LinkedLists.Q2_01_Remove_Dups.solution;

import CtCI.CtCILibrary.LinkedListNode;

public class Tester {

	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
		LinkedListNode current = head;
		for (int i = 1; i < 10; i++) {
			LinkedListNode next = new LinkedListNode((int) (Math.random() * 5 + 1), null, null);
			current.setNext(next);
			next.setPrevious(current);
			current = next;
		}
		System.out.println(head.printForward());

//		LinkedListNode cloneA = head.clone();
//		LinkedListNode cloneB = head.clone();
//		LinkedListNode cloneC = head.clone();
		//QuestionA.deleteDups(cloneA);
		//QuestionA.deleteDups(cloneB);
		//QuestionA.deleteDups(cloneC);
		
//		System.out.println(cloneA.printForward());
//		System.out.println(cloneB.printForward());
//		System.out.println(cloneC.printForward());
	}

}
