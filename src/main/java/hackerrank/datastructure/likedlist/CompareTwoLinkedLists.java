package hackerrank.datastructure.likedlist;

/**
 * https://www.hackerrank.com/challenges/compare-two-linked-lists
 */
public class CompareTwoLinkedLists {

    int CompareLists(Node headA, Node headB) {
        Node currA = headA;
        Node currB = headB;

        while (currA != null && currB != null) {
            if (currA.data != currB.data) {
                return 0;
            }
            currA = currA.next;
            currB = currB.next;
        }

        return currA == null && currB == null ? 1 : 0;
    }

}
