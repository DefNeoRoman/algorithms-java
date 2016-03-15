package hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/countingsort4
 */
public class CountingSourt4 {


	public static int[] accumulateFrequency(String[] input) {
		int[] frequency = new int[100];
		for (String str : input) {
			int num = Integer.parseInt(str.split(" ")[0]);
			for (int i = num; i < frequency.length; i++) {
				frequency[i] += 1;
			}
		}
		return frequency;
	}

	@Test
	public void test() {
		String rawInput =
//				"0 ab\n" +
//				"6 cd\n" +
//				"0 ef\n" +
//				"6 gh\n" +
//				"4 ij\n" +
//				"0 ab\n" +
//				"6 cd\n" +
//				"0 ef\n" +
//				"6 gh\n" +
//				"0 ij\n" +
				"4 that\n" +
				"3 be\n" +
				"0 to\n" +
				"1 be\n" +
				"5 question\n" +
				"1 or\n" +
				"2 not\n" +
				"4 is\n" +
				"2 to\n" +
				"4 the";

		String[] input = rawInput.split("\n");
		int[] indexes = accumulateFrequency(input);
		System.out.println(Arrays.toString(indexes));

		for (int i = 0; i < indexes.length; i++) {
			System.out.println(input[i]);
		}
	}

}
