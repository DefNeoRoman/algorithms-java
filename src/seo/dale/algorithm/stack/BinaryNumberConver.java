package seo.dale.algorithm.stack;

import java.util.Stack;


/**
 * 10 진수를 2 진수로 변환하는 프로그램
 */
public class BinaryNumberConver {

	public static String convert(String numChar) {
		int num = Integer.parseInt(numChar);
		
		if (num < 0) {
			throw new IllegalArgumentException("No minus values.");
		}
		
		if (num == 0) {
			return "0";
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while (num >= 1) {
			stack.push(num % 2);
			num /= 2;
		}
		
		StringBuilder builder = new StringBuilder();
		while (!stack.empty()) {
			builder.append(stack.pop());
		}
		
		return builder.toString();
	}
	

}
