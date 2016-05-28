package seo.dale.algorithm.list.singly4;

/**
 * http://crunchify.com/a-simple-singly-linked-list-implementation-in-java/
 * 솔직히 tail과 size 필드를 가져야 할 이유는 잘 모르겠음
 * 로직은 까다로워지는 반면 성능상의 효과는 거의 없는 것 같음
 */
public class SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);
        if (tail == null) {
            tail = node;
        }

        node.setNext(head);
        head = node;

        size++;
    }

    public void addLast(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;

        size++;
    }

    public void addAfter(T data, T afterData) {
        Node<T> current = head;
        while (current != null) {
            if (current.getData() == afterData) {
                break;
            }
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("Unable to find the given element...");
        }

        Node<T> node = new Node<>(data);
        node.setNext(current.getNext());
        current.setNext(node);
        if (current == tail) {
            tail = node;
        }

        size++;
    }

    public void deleteFirst() {
        if (size == 0) {
            System.err.println("Underflow...");
        }

        head = head.getNext();
        while (head == null) {
            tail = null;
        }

        size--;
    }

    public void deleteLast() {
        if (size == 0) {
            System.err.println("Underflow...");
        }

        Node<T> before = head;
        for (int i = 0; i < size - 2; i++) {
            before = before.getNext();
        }

        before.setNext(null);
        tail = before;

        size--;
    }


    public void deleteAfter(T afterData) {
        if (size == 0) {
            System.err.println("Underflow...");
        }

        Node<T> current = head;
        while (current != null) {
            if (current.getData() == afterData) {
                break;
            }
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("Unable to find the given element...");
        }

        if (current.getNext() == null) {
            System.out.println("Nothing to delete...");
        }

        current.setNext(current.getNext().getNext());

        if (current.getNext() == null) {
            tail = current;
        }

        size--;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            builder.append(current.getData());
            builder.append("->");
            current = current.getNext();
        }
        if (builder.length() > 2) {
            builder.setLength(builder.length() - 2);
        }
        return builder.toString();
    }


}

class Node<T> implements Comparable<T> {

    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public T getData() {
        return value;
    }

    public void setData(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> nextRef) {
        this.next = nextRef;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

}
