package CtCI.Ch03.StacksAndQueues.Introduction;

import org.junit.Test;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class MyStackTest {

	@Test
	public void test() throws Exception {
		MyStack<Integer> myStack = new MyStack<>();
		myStack.push(0);
		System.out.println(myStack.peek());
		myStack.push(1);
		System.out.println(myStack.peek());
		myStack.push(2);
		System.out.println(myStack.peek());

		System.out.println("--------------------");

		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}