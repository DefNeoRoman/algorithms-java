package CtCI.Ch01_ArraysAndStrings.Q1_03_URLify;

import CtCI.CtCILibrary.AssortedMethods;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_03_URLify/Question.java
 */
public class Question {

	public static void replaceSpaces(char[] str, int trueLength) {
		int last = trueLength - 1;
		for (int cur = str.length - 1; cur > -1; cur--) {
			if (str[last] == ' ') {
				str[cur] = '0';
				str[cur - 1] = '2';
				str[cur - 2] = '%';
				cur -= 2;
			} else {
				str[cur] = str[last];
			}
			last--;
		}
	}

	@Test
	public void test() {
		String str = "Mr John Smith    ";
		char[] arr = str.toCharArray();
		int length = 13;
		replaceSpaces(arr, length);
		String actual = AssortedMethods.charArrayToString(arr);
		System.out.println(actual);
		assertEquals("Mr%20John%20Smith", actual);
	}

}
