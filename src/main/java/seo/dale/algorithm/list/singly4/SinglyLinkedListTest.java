package seo.dale.algorithm.list.singly4;

import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void test() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.addFirst(3);
        list.addFirst(32);
        list.addFirst(54);
        list.addFirst(89);
        list.addAfter(76, 54);
        System.out.println(list);
        list.deleteFirst();
        list.deleteAfter(76);
        System.out.println(list);
    }

}