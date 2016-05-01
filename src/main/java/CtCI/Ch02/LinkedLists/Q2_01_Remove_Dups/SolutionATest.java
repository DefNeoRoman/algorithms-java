package CtCI.Ch02.LinkedLists.Q2_01_Remove_Dups;

import CtCI.CtCILibrary.LinkedListNode;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SolutionATest {

    @Test
    public void DeleteDups() {
        LinkedListNode head = new LinkedListNode(0, null, null);
        LinkedListNode current = head;
        for (int i = 1; i < 10; i++) {
            LinkedListNode next = new LinkedListNode((int) (Math.random() * 5 + 1), null, null);
            current.setNext(next);
            next.setPrevious(current);
            current = next;
        }
        System.out.println(head.printForward());
        SolutionA.deleteDups(head);
        System.out.println(head.printForward());
    }

}
