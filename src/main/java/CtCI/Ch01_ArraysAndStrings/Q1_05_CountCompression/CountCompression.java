package CtCI.Ch01_ArraysAndStrings.Q1_05_CountCompression;

public class CountCompression {

	public static void main(String[] args) {
		String input = "aabccccccccaaa";
		String output = "a2b1c8a3";
		System.out.println(output);
		System.out.println(compress(input));
	}

	public static String compress(String text) {
		StringBuilder builder = new StringBuilder();
		char[] chars = text.toCharArray();
		for (int i = 0; i < chars.length;) {
			int cnt = 1;
			int j = i + 1;
			while (j < chars.length && chars[j] == chars[i]) {
				cnt ++;
				j++;
			}
			builder.append(chars[i]).append(cnt);
			i = j;
		}
		return builder.length() < text.length() ? builder.toString() : text;
	}

}
