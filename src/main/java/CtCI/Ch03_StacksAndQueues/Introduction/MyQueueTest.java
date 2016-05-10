package CtCI.Ch03_StacksAndQueues.Introduction;

import org.junit.Test;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class MyQueueTest {

	@Test
	public void test() {
		MyQueue<Integer> myQueue = new MyQueue<>();
		myQueue.enqueue(0);
		myQueue.enqueue(1);
		myQueue.enqueue(2);

		System.out.println("--------------------");

		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
	}

}