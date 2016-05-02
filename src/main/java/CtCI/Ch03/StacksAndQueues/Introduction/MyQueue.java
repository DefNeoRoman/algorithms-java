package CtCI.Ch03.StacksAndQueues.Introduction;

import java.util.NoSuchElementException;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class MyQueue<T> {

	private MyNode<T> first;
	private MyNode<T> last;

	public void enqueue(T data) {
		MyNode node = new MyNode(data);
		if (last != null) {
			last.next = node;
		}
		last = node;
		if (first == null) {
			first = last;
		}
	}

	public T dequeue() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		T data = first.data;
		first = first.next;
		return data;
	}

}
