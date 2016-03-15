package hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/countingsort4
 * stlabe 하게 만드는 걸 못해서 포기
 */
public class CountingSort4 {

	public static int[] accumulateFrequency(int[] counts) {
		int[] frequency = new int[100];

		for (int c : counts) {
			frequency[c] += 1;
		}

		for (int i = 1; i < frequency.length; i++) {
			frequency[i] += frequency[i-1];
		}

		return frequency;
	}

	@Test
	public void test() {
		String rawInput =
				"0 ab\n" +
				"6 cd\n" +
				"0 ef\n" +
				"6 gh\n" +
				"4 ij\n" +
				"0 ab\n" +
				"6 cd\n" +
				"0 ef\n" +
				"6 gh\n" +
				"0 ij\n" +
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

		int[] counts = new int[input.length];
		String[] strings = new String[input.length];

		for (int i = 0; i < input.length; i++) {
			String[] tokens = input[i].split(" ");
			counts[i] = Integer.parseInt(tokens[0]);
			if (i < input.length / 2) {
				strings[i] = "-";
			} else {
				strings[i] = tokens[1];
			}
		}

		System.out.println("counts : " + Arrays.toString(counts));
		System.out.println("strings : " + Arrays.toString(strings));

		int[] indexes = accumulateFrequency(counts);
		System.out.println("indexes : " + Arrays.toString(indexes));

		String[] sortedStrings = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			indexes[counts[i]] -= 1;
			int index = indexes[counts[i]];
			sortedStrings[index] = strings[i];
		}

		System.out.println("sortedStrings : " + Arrays.toString(sortedStrings));
	}

}
