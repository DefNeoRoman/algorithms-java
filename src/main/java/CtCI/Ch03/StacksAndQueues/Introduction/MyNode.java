package CtCI.Ch03.StacksAndQueues.Introduction;

/**
 * @author 서대영/Store기술개발팀/SKP
 */

public class MyNode<T> {
	T data;
	MyNode<T> next;

	public MyNode(T data) {
		this.data = data;
	}
}