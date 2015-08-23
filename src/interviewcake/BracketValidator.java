package interviewcake;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://www.interviewcake.com/question/bracket-validator?utm_source=
 * weekly_email
 */
public class BracketValidator {

	/**
	 * O(n) time and space using a map
	 */
	public boolean validate2(String input) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('[', ']');
		map.put('{', '}');
		map.put('(', ')');
		Stack<Character> stack = new Stack<Character>();
		for (char ch : input.toCharArray()) {
			if (map.keySet().contains(ch)) {
				stack.push(ch);
			} else if (map.values().contains(ch)) {
				if (stack.isEmpty() || map.get(stack.pop()) != ch)
					return false;
			}
		}
		return stack.isEmpty();
	}
	
	/**
	 * O(n) time and space using switch-case
	 */
	public boolean validate(String input) {
		Stack<Character> stack = new Stack<Character>();
		for (char ch : input.toCharArray()) {
			switch (ch) {
			case '[':
			case '{':
			case '(':
				stack.push(ch);
				break;
			case ']':
				if (stack.isEmpty() || stack.pop() != '[')
					return false;
				break;
			case '}':
				if (stack.isEmpty() || stack.pop() != '{')
					return false;
				break;
			case ')':
				if (stack.isEmpty() || stack.pop() != '(')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}

}
