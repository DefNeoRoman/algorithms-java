package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_07_Permutations_Without_Dups;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MySolution {

	@Test
	public void test() {
		String[] list = getPerms("abcde");
		System.out.println("There are " + list.length + " permutations.");
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
	}

	public static String[] getPerms(String str) {
		return getPerms(str, str.length());
	}

	public static String[] getPerms(String str, int size) {
		if (size == 1) {
			return new String[]{"" + str.charAt(size - 1)};
		}

		String[] previous = getPerms(str, size - 1);
		String[] current = new String[previous.length * size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < previous.length; j++) {
				int index = previous.length * i + j;
				String data = insertAt(previous[j], i, str.charAt(size - 1));
				current[index] = data;
			}
		}

		System.out.printf("gerPerms(%s, %s) => %s%n", str, size, Arrays.toString(current));

		return current;
	}

	private static String insertAt(String str, int index, char ch) {
		String before = str.substring(0, index);
		String after = str.substring(index);
		return before + ch + after;
	}

	@Test
	public void testInsertAt() {
		assertEquals("#abc", insertAt("abc", 0, '#'));
		assertEquals("a#bc", insertAt("abc", 1, '#'));
		assertEquals("ab#c", insertAt("abc", 2, '#'));
		assertEquals("abc#", insertAt("abc", 3, '#'));
	}


}
