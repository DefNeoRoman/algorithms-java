package CtCI.Ch03_StacksAndQueues.Q3_02_Stack_Min;

import org.junit.Test;

public class MySolutionTest {

	private MySolution stack = new MySolution();

	@Test
	public void test() {
		int[] array = {2, 1, 3, 1};
		for (int value : array) {
			stack.push(value);
			System.out.print(value + ", ");
		}
		System.out.println('\n');
		for (int i = 0; i < array.length; i++) {
			System.out.println("Popped " + stack.pop());
			System.out.println("New min is " + stack.min());
		}
	}

}