package codility.word_machine_emulator;

import java.util.Stack;

/**
 * https://codility.com/tasks/word_machine_emulator/
 * https://codility.com/tickets/tryFR7YE8-2D2/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("13 DUP 4 POP 5 DUP + DUP + -")); // 7
		System.out.println(s.solution("5 6 + -")); // -1 (EmptyStackException)
		System.out.println(s.solution("3 DUP 5 - -")); // -1 (RuntimeException: underflow)
		System.out.println(s.solution("1048575 1 +")); // -1 (RuntimeException: overflow)
	}

	public int solution(String S) {
		String[] words = S.split("\\s");
		Stack<Integer> stack = new Stack<>();
		for (String word : words) {
			try {
				process(word, stack);
			} catch (Exception e) {
				System.err.println(e);
				return -1;
			}
		}
		return stack.peek();
	}

	private void process(String word, Stack<Integer> stack) {
		if (word.matches("\\d+")) {
			stack.push(Integer.valueOf(word));
		} else if (word.equals("POP")) {
			stack.pop();
		} else if (word.equals("DUP")) {
			stack.push(stack.peek());
		} else if (word.equals("+")) {
			int sum = stack.pop() + stack.pop();
			if (sum > (1 << 20) - 1) {
				throw new RuntimeException("overflow");
			}
			stack.push(sum);
		} else if (word.equals("-")) {
			int sub = stack.pop() - stack.pop();
			if (sub < 0) {
				throw new RuntimeException("underflow");
			}
			stack.push(sub);
		} else {
			throw new RuntimeException("invalid operation");
		}
	}

}
