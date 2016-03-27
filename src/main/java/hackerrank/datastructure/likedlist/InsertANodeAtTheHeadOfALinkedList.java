package hackerrank.datastructure.likedlist;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list
 */
public class InsertANodeAtTheHeadOfALinkedList {

    Node Insert(Node head,int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;
        return newNode;
    }

}
