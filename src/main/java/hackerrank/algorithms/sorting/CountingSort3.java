package hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/countingsort3
 */
public class CountingSort3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		scanner.nextLine();

		String[] input = new String[count];
		for (int i = 0; i < count; i++) {
			input[i] = scanner.nextLine();
		}

		int[] output = accumulateFrequency(input);
		for (int i : output) {
			System.out.print(i + " ");
		}
	}

	public static int[] accumulateFrequency(String[] input) {
		int[] frequency = new int[100];

		for (String str : input) {
			int num = Integer.parseInt(str.split(" ")[0]);
			frequency[num] += 1;
		}

		for (int i = 1; i < frequency.length; i++) {
			frequency[i] += frequency[i-1];
		}

		return frequency;	
	}

	@Test
	public void test() {
		String[] input = {"4 that", "3 be", "0 to", "1 be", "5 question", "1 or", "2 not", "4 is", "2 to", "4 the"};
		int[] output = accumulateFrequency(input);
		for (int i : output) {
			System.out.print(i + " ");
		}
	}

}
