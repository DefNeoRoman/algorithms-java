package CtCI.Ch02.LinkedLists.Q2_01_Remove_Dups;

import CtCI.CtCILibrary.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Using two linkedLists
 */
public class SolutionB {

    public static void deleteDups(LinkedListNode root) {
        LinkedListNode current = root;
        while (current != null) {
            System.out.println("For current data : " + current.data);
            LinkedListNode runner = current;
            while (runner.next != null) {
                System.out.println("\tcheck " +  runner.next.data);
                if (runner.next.data == current.data) {
                    System.out.println("\t\tdelete " + runner.next.data);
                    runner.next = runner.next.next;
                    // runner.next.prev = runner;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

}
