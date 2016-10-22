package CtCI.Ch01_ArraysAndStrings.Q1_04_ReplaceSpaces;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%201/Question1_4/Question.java
 */
public class ReplaceSpaces2 {

	public static void main(String[] args) {
		String str = "Mr John Smith";
		int length = 13;
		String actual = replaceSpaces(str, length);
		String expected = "Mr%20John%20Smith";
		System.out.println(expected);
		System.out.println(actual);
	}

	public static String replaceSpaces(String str, int length) {
		char[] chars = str.toCharArray();

		int spaces = 0;
		for (char ch : chars) {
			if (ch == ' ') {
				spaces += 1;
			}
		}

		char[] result = new char[length + spaces * 2];

		int i = 0;
		for (char ch : chars) {
			if (ch == ' ') {
				result[i++] = '%';
				result[i++] = '2';
				result[i++] = '0';
			} else {
				result[i++] = ch;
			}
		}
		return new String(result);
	}

}
