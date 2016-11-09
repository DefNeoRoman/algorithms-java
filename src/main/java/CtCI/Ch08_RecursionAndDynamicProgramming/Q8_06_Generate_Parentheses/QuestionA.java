package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_06_Generate_Parentheses;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%209/Question9_6/QuestionA.java
 */
public class QuestionA {

	public static Set<String> generateParens(int remaining) {
		if (remaining == 1) {
			return Collections.singleton("()");
		}
		Set<String> parens = new HashSet<>();
		for (String paren : generateParens(remaining - 1)) {
			parens.add("()" + paren);
			int idx = 0;
			while (idx < paren.length()) {
				if (paren.charAt(idx) == '(') {
					parens.add(paren.substring(0, idx + 1) + "()" + paren.substring(idx + 1));
				}
				idx++;
			}
		}
		return parens;
	}

	public static void main(String[] args) {
		Set<String> list = generateParens(4);
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println(list.size());
	}

}
