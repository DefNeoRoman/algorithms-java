package plalab.algorithm.hw4;

import java.util.HashMap;
import java.util.Map;

public class Hw4 {
	
	public static Map<String, Integer> cacheTrue = new HashMap<String, Integer>();
	public static Map<String, Integer> cacheFalse = new HashMap<String, Integer>();
	
	static {
		cacheTrue.put("1", 1);
		cacheTrue.put("0", 0);
		cacheFalse.put("1", 0);
		cacheFalse.put("0", 1);
	}

	public static int countSolutionsDaleSeo(String exp, boolean result) {		
		if (result) {
			if (cacheTrue.containsKey(exp)) {
				return cacheTrue.get(exp);
			}
		} else {
			if (cacheFalse.containsKey(exp)) {
				return cacheFalse.get(exp);
			}
		}
		
		int count = 0;
		
		for (int i = 1; i < exp.length(); i += 2) {
			char op = exp.charAt(i);
			String left = exp.substring(0, i);
			String right = exp.substring(i + 1, exp.length());
			
			if (result) {
				switch (op) {
				case '|':
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, true);
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, true);
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, false);
					break;
				case '&':
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, true);
					break;
				case '^':
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, false);
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, true);
					break;
				}	
				cacheTrue.put(exp, count);
			} else {
				switch (op) {
				case '|':
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, false);
					break;
				case '&':
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, false);
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, true);
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, false);
					break;
				case '^':
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, true);
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, false);
					break;
				}
				cacheFalse.put(exp, count);
			}
		}
		
		return count;
	}
	
	public static int countSolutionsDaleSeoWithLoggig(String exp, boolean result) {
		System.out.println("Expression : " + exp);
		
		/*
		if (exp.length() == 1) {
			if ("1".equals(exp)) {
				System.out.println("-- Leaf Count : " + (result ? 1 : 0));
				return result ? 1 : 0;
			} else {
				System.out.println("-- Leaf Count : " + (result ? 0 : 1));
				return result ? 0 : 1;
			}
		}
		*/
		
		if (result) {
			if (cacheTrue.containsKey(exp)) {
				return cacheTrue.get(exp);
			}
		} else {
			if (cacheFalse.containsKey(exp)) {
				return cacheFalse.get(exp);
			}
		}
		
		int count = 0;
		
		for (int i = 1; i < exp.length(); i += 2) {

			char op = exp.charAt(i);
			String left = exp.substring(0, i);
			String right = exp.substring(i + 1, exp.length());
			
			System.out.println("-- Left : " + left);
			System.out.println("-- Operator : " + op);
			System.out.println("-- Right : " + right);
			
			if (result) {
				switch (op) {
				case '|':
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, true);
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, true);
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, false);
					break;
				case '&':
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, true);
					break;
				case '^':
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, false);
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, true);
					break;
				}	
				cacheTrue.put(exp, count);
			} else {
				switch (op) {
				case '|':
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, false);
					break;
				case '&':
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, false);
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, true);
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, false);
					break;
				case '^':
					count += countSolutionsDaleSeo(left, true) * countSolutionsDaleSeo(right, true);
					count += countSolutionsDaleSeo(left, false) * countSolutionsDaleSeo(right, false);
					break;
				}
				cacheFalse.put(exp, count);
			}
		}
		
		System.out.println("-- Middle Count : " + count);
		return count;
	}

}
