package CtCI.Ch03.StacksAndQueues.Q3_01_Three_in_One;

import org.junit.Test;

/**
 * 하나의 배열을 사용해 세 개의 스택을 구현하는 방법을 설명하라.
 * @author 서대영/Store기술개발팀/SKP
 */
public class SolutionATest {

	@Test
	public void testIsEmpty() {
		SolutionA stack = new SolutionA(3);

		stack.push(1, 11);
		stack.push(1, 12);
		stack.push(1, 13);

		stack.pop(1);
		stack.pop(1);
		stack.pop(1);

		// empty
		stack.pop(1);
	}

	@Test
	public void testIsFull() {
		SolutionA stack = new SolutionA(3);

		stack.push(2, 21);
		stack.peek(2);
		stack.push(2, 22);
		stack.peek(2);
		stack.push(2, 23);
		stack.peek(2);

		// full
		stack.push(2, 24);
		stack.peek(2);
	}

	@Test
	public void test() {
		SolutionA stack = new SolutionA(5);

		stack.push(0, 1);
		stack.peek(0);
		stack.push(0, 2);
		stack.peek(0);
		stack.push(0, 3);
		stack.peek(0);

		stack.pop(0);
		stack.pop(0);
		stack.pop(0);
	}

	@Test
	public void test1() {
		SolutionA stack = new SolutionA(5);

		stack.push(1, 11);
		stack.peek(1);
		stack.push(1, 12);
		stack.peek(1);
		stack.push(1, 13);
		stack.peek(1);

		stack.pop(1);
		stack.pop(1);
		stack.pop(1);
	}

	@Test
	public void test2() {
		SolutionA stack = new SolutionA(5);

		stack.push(2, 21);
		stack.peek(2);
		stack.push(2, 22);
		stack.peek(2);
		stack.push(2, 23);
		stack.peek(2);

		stack.pop(2);
		stack.pop(2);
		stack.pop(2);
	}

}
