package CtCI.Ch01_ArraysAndStrings.Q1_06_CountCompression;

/**
 * https://github.com/careercup/ctci/blob/master/java/Chapter%201/Question1_5/Question.java
 */
public class CountCompressio2 {

	public static void main(String[] args) {
		String input = "aabccccccccaaa";
		String output = "a2b1c8a3";
		System.out.println(output);
		System.out.println(compress(input));

		input = "abc";
		output = "abc";
		System.out.println(output);
		System.out.println(compress(input));
	}

	public static String compress(String text) {
		if (sizeCompression(text) >= text.length()) {
			return text;
		}
		StringBuilder builder = new StringBuilder();
		char[] chars = text.toCharArray();
		char latest = chars[0];
		int count = 1;
		for (int i = 1; i < chars.length; i++) {
			if (latest == chars[i]) {
				count ++;
			} else {
				builder.append(latest).append(count);
				latest = chars[i];
				count = 1;
			}
		}
		builder.append(latest).append(count);
		return builder.toString();
	}

	private static int sizeCompression(String text) {
		int size = 0;
		char[] chars = text.toCharArray();
		char latest = chars[0];
		int count = 1;
		for (int i = 1; i < chars.length; i++) {
			if (latest == chars[i]) {
				count ++;
			} else {
				size += 1 + Integer.toString(count).length();
				latest = chars[i];
				count = 1;
			}
		}
		return size;
	}

}
