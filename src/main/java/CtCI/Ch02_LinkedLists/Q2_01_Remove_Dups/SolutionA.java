package CtCI.Ch02_LinkedLists.Q2_01_Remove_Dups;

import CtCI.CtCILibrary.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Using a hash table. O(n) time and space
 */
public class SolutionA {

    public static void deleteDups(LinkedListNode root) {
        Set<Integer> set = new HashSet<>();
        LinkedListNode current = root;
        while (current != null) {
            if (set.contains(current.data)) {
                System.out.printf("deleting %s from linked list.\n", current.data);
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            } else {
                System.out.printf("adding %s to set.\n", current.data);
                set.add(current.data);
            }
            current = current.next;
        }
    }

}
