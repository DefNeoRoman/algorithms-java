package CtCI.Ch07_ObjectOrientedDesign.Q7_02_CallHandler;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class CallQueue {

	private Queue<Customer> queue;

	public CallQueue() {
		queue = new LinkedList<>();
	}

	public void offerCall(Customer customer) {
		queue.offer(customer);
	}

	public Customer pollCall() {
		return queue.poll();
	}

}
