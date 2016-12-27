package CtCI.Ch03_StacksAndQueues.Q3_04_Queue_via_Stacks;

import CtCI.CtCILibrary.AssortedMethods;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2003.%20Stacks%20and%20Queues/Q3_04_Queue_via_Stacks
 */
public class QueueViaStacks<T> {

	private Stack<T> inStack = new Stack<>();
	private Stack<T> outStack = new Stack<>();

	public void add(T item) {
		inStack.push(item);
	}

	public T remove() {
		shiftStacks();
		return outStack.pop();
	}

	public T peek() {
		shiftStacks();
		return outStack.peek();
	}

	private void shiftStacks() {
		if (outStack.isEmpty()) {
			if (inStack.isEmpty()) {
				throw new NoSuchElementException();
			}
			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
	}

	public int size() {
		return inStack.size() + outStack.size();
	}

	public static void main(String[] args) {
		QueueViaStacks<Integer> my_queue = new QueueViaStacks<Integer>();

		// Let's test our code against a "real" queue
		Queue<Integer> test_queue = new LinkedList<Integer>();

		for (int i = 0; i < 100; i++) {
			int choice = AssortedMethods.randomIntInRange(0, 10);
			if (choice <= 5) { // enqueue
				int element = AssortedMethods.randomIntInRange(1, 10);
				test_queue.add(element);
				my_queue.add(element);
				System.out.println("Enqueued " + element);
			} else if (test_queue.size() > 0) {
				int top1 = test_queue.remove();
				int top2 = my_queue.remove();
				if (top1 != top2) { // Check for error
					System.out.println("******* FAILURE - DIFFERENT TOPS: " + top1 + ", " + top2);
				}
				System.out.println("Dequeued " + top1);
			}

			if (test_queue.size() == my_queue.size()) {
				if (test_queue.size() > 0 && test_queue.peek() != my_queue.peek()) {
					System.out.println("******* FAILURE - DIFFERENT TOPS: " + test_queue.peek() + ", " + my_queue.peek() + " ******");
				}
			} else {
				System.out.println("******* FAILURE - DIFFERENT SIZES ******");
			}
		}
	}

}
