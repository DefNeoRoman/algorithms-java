package hackerrank.datastructure.likedlist;

import org.junit.Test;

/**
 * https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists
 */
public class MergeTwoSortedLinkedLists {

    @Test
    public void test() {
        Node a = new Node(1, new Node(2, new Node(3)));
        Node b = new Node(0, new Node(3, new Node(4, new Node(6))));
        Node c = MergeLists(a, b);

        while (c != null) {
            System.out.println(c.data);
            c = c.next;
        }
    }

    Node MergeLists(Node headA, Node headB) {
        if (headA == null) {
            return headB;
        }

        if (headB == null) {
            return headA;
        }

        if (headA.data < headB.data) {
            headA.next = MergeLists(headA.next, headB);
            return headA;
        } else {
            headB.next = MergeLists(headA, headB.next);
            return headB;
        }
    }

}
