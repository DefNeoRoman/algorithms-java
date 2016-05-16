package CtCI.Ch03_StacksAndQueues.Q3_03_Stack_of_Plates;

import org.junit.Test;

public class MySolutionTest {

	@Test
	public void test() {
		int capacity_per_substack = 5;
		MySolution setOfStack = new MySolution(capacity_per_substack);
		for (int i = 0; i < 24; i++) {
			setOfStack.push(i);
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("Popped " + setOfStack.popAt(i) + " at " + i);
		}
		for (int i = 0; i < 20; i++) {
			System.out.println("Popped " + setOfStack.pop());
		}
	}

}