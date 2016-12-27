package CtCI.Ch03_StacksAndQueues.Q3_05_Sort_Stack;

import CtCI.CtCILibrary.AssortedMethods;

import java.util.Stack;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2003.%20Stacks%20and%20Queues/Q3_05_Sort_Stack/Question.java
 */
public class Question {

	public static void sort(Stack<Integer> stack) {
		Stack<Integer> descStack = new Stack<>();
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			while (!descStack.isEmpty() && temp < descStack.peek()) {
				stack.push(descStack.pop());
			}
			descStack.push(temp);
		}

		while (!descStack.isEmpty()) {
			stack.push(descStack.pop());
		}
	}

	public static void main(String [] args) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < 10; i++) {
			int r = AssortedMethods.randomIntInRange(0,  100);
			s.push(r);
		}

		sort(s);

		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
