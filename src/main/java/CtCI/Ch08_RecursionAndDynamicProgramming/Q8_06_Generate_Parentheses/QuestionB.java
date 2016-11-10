package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_06_Generate_Parentheses;

import java.util.LinkedList;
import java.util.List;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%209/Question9_6/QuestionB.java
 */
public class QuestionB {

	public static void addParen(List<String> list, int left, int right, char[] str, int count) {
		if (left + right == count * 2) {
			list.add(String.copyValueOf(str));
			return;
		}

		if (left < count) {
			str[left + right] = '(';
			addParen(list, left + 1, right, str, count);
		}

		if (right < left) {
			str[left + right] = ')';
			addParen(list, left, right + 1, str, count);
		}
	}

	public static List<String> generateParens(int count) {
		List<String> list = new LinkedList<>();
		char[] str = new char[count * 2];
		addParen(list, 0, 0, str, count);
		return list;
	}

	public static void main(String[] args) {
		List<String> list = generateParens(3);
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println(list.size());
	}
}
