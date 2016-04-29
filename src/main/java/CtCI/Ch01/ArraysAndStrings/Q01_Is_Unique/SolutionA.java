package CtCI.Ch01.ArraysAndStrings.Q01_Is_Unique;

import java.util.HashSet;
import java.util.Set;

/**
 * Set을 이용하여 구현
 * O(n) time, O(1) space
 * @author 서대영/Store기술개발팀/SKP
 */
public class SolutionA {

	public static boolean hasUniqueChars(String str) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (set.contains(ch)) {
				return false;
			}
			set.add(ch);
		}
		return true;
	}

}
