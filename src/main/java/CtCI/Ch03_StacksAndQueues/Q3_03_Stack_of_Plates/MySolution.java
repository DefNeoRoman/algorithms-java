package CtCI.Ch03_StacksAndQueues.Q3_03_Stack_of_Plates;

import java.util.*;

public class MySolution   {

	private Stack<Deque<Integer>> dequeStack = new Stack<>();

	private int capacity;

	public MySolution(int capacity) {
		this.capacity = capacity;
		Deque<Integer> stack = new ArrayDeque<>(capacity);
		dequeStack.push(stack);
	}

	public void push(int item) {
		Deque<Integer> deque = dequeStack.peek();

		if (deque == null | deque.size() >= capacity) {
			deque = dequeStack.push(new ArrayDeque<>(capacity));
		}

		deque.push(item);
	}

	public int pop() {
		Deque<Integer> deque = dequeStack.peek();

		if (deque.isEmpty()) {
			dequeStack.pop();
			deque = dequeStack.peek();
		}

		return deque.pop();
	}

	public int popAt(int index) {
		Deque<Integer> dequeAt = dequeStack.get(index);
		return dequeAt.pop();
	}

}
