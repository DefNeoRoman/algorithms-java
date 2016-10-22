package CtCI.Ch01_ArraysAndStrings.Q1_04_ReplaceSpaces;

public class ReplaceSpaces {

	public static void main(String[] args) {
		String str = "Mr John Smith";
		int length = 13;
		String actual = replaceSpaces(str, length);
		String expected = "Mr%20John%20Smith";
		System.out.println(expected);
		System.out.println(actual);
	}

	public static String replaceSpaces(String str, int length) {
		StringBuilder builder = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (ch == ' ') {
				builder.append("%20");
			} else {
				builder.append(ch);
			}
		}
		return builder.toString();
	}

}
