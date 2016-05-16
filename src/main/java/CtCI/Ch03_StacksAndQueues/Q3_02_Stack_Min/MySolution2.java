package CtCI.Ch03_StacksAndQueues.Q3_02_Stack_Min;

import java.util.Stack;

public class MySolution2 {

	private Stack<Node> itemStack = new Stack<>();

	public void push(int item) {
		int min = Math.min(item, min());
		itemStack.push(new Node(item, min));
	}

	public int pop() {
		Node node = itemStack.pop();
		return node.getValue();
	}

	public int min() {
		if (itemStack.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		Node node = itemStack.peek();
		return node.getMin();
	}

}

class Node {

	private int value;
	private int min;

	public Node(int value, int min) {
		this.value = value;
		this.min = min;
	}

	public int getValue() {
		return value;
	}

	public int getMin() {
		return min;
	}

}
