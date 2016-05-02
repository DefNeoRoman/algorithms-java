package CtCI.Ch03.StacksAndQueues.Introduction;

import java.util.EmptyStackException;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class MyStack<T> {

	private MyNode<T> top;

	public void push(T data) {
		MyNode<T> node = new MyNode(data);
		node.next = top;
		top = node;
	}

	public T peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	public T pop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		T data = top.data;
		top = top.next;
		return data;
	}

}
