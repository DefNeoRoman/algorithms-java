package seo.dale.algorithm.list.singly3;

import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void test() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.addBack(3);
        list.addBack(32);
        list.addBack(54);
        list.addBack(89);
        list.addAfter(76, 54);
        System.out.println(list);
        list.deleteFront();
        list.deleteAfter(76);
        System.out.println(list);
    }

}