package hackerrank.datastructure.array;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/arrays-ds
 */
public class ArraysDs {

	@Test
	public void test() {
		String input = "4\n" +
				"1 4 3 2";

		execute(new ByteArrayInputStream(input.getBytes()));
	}

	public static void main(String[] args) {
		execute(System.in);
	}

	private static void execute(InputStream inputStream) {
		Scanner scanner = new Scanner(inputStream);
		int cnt = scanner.nextInt();
		int[] ints = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			ints[i] = scanner.nextInt();
		}

		printInReverseOrder(ints);
	}

	private static void printInReverseOrder(int[] ints) {
		for (int i = ints.length - 1; i >= 0; i--) {
			System.out.print(ints[i] + " ");
		}
	}

}
