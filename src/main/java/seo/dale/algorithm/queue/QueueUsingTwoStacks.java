package seo.dale.algorithm.queue;

import java.util.Stack;

/*
Question 2
Implement a queue using 2 stacks. Specifically, implement the enqueue and dequeue
methods.
This question is good because it shows how well the candidate knows their data structures. It also forces
them to write a class with some internal state.
Solution
In the constructor initialize 2 stacks, “entryStack” and “exitStack”. The enqueue method pushes the value
onto entryStack. The dequeue method pops from exitStack if it’s not empty, otherwise pop all items from
entryStack onto exitStack. If they’re both empty throw an exception
 */
public class QueueUsingTwoStacks {
	
	Stack<Integer> entryStack = new Stack<Integer>();
	Stack<Integer> exitStack = new Stack<Integer>();
	
	public void enqueue(Integer item) {
		entryStack.push(item);
	}
	
	public Integer dequeue() {
		if (exitStack.isEmpty()) {
			while (!entryStack.isEmpty()) {
				exitStack.push(entryStack.pop());
			}
		}		
		
		return exitStack.pop();
	}

}
