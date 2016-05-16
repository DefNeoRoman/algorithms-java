package CtCI.Ch03_StacksAndQueues.Q3_02_Stack_Min;

import java.util.Stack;

public class MySolution {

	private Stack<Integer> itemStack = new Stack<>();
	private Stack<Integer> minStack = new Stack<>();

	public void push(int item) {
		itemStack.push(item);
		if (item <= min()) {
			minStack.push(item);
		}
	}

	public int pop() {
		int item = itemStack.pop();
		if (item == minStack.peek()) {
			minStack.pop();
		}
		return item;
	}

	public int min() {
		if (minStack.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return minStack.peek();
	}

}
