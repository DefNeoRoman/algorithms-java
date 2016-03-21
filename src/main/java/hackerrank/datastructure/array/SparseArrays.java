package hackerrank.datastructure.array;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sparse-arrays
 */
public class SparseArrays {

	@Test
	public void test() {
		String input = "4\n" +
				"aba\n" +
				"baba\n" +
				"aba\n" +
				"xzxb\n" +
				"6\n" +
				"aba\n" +
				"xzxb\n" +
				"ab\n" +
				"aba\n" +
				"xzxb\n" +
				"ab";
		execute(new ByteArrayInputStream(input.getBytes()));
	}

	public static void main(String[] args) {
		execute(System.in);
	}

	private static void execute(InputStream in) {
		Scanner scanner = new Scanner(in);

		int numOfStrings = scanner.nextInt();
		String[] stringArray = new String[numOfStrings];
		for (int i = 0; i < numOfStrings; i++) {
			stringArray[i] = scanner.next();
		}

		int numOfQueries = scanner.nextInt();
		String[] queryArray = new String[numOfQueries];
		for (int i = 0; i < numOfQueries; i++) {
			queryArray[i] = scanner.next();
		}

		// System.out.println("stringArray : " + Arrays.toString(stringArray));
		// System.out.println("queryArray : " + Arrays.toString(queryArray));

		printOccurrences(stringArray, queryArray);
	}

	// O(n)
	private static void printOccurrences(String[] stringArray, String[] queryArray) {
		Map<String, Integer> counterMap = new HashMap<>();
		for (String string : stringArray) {
			if (counterMap.containsKey(string)) {
				counterMap.put(string, counterMap.get(string) + 1);
			} else {
				counterMap.put(string, 1);
			}
		}

		for (String query : queryArray) {
			if (counterMap.containsKey(query)) {
				System.out.println(counterMap.get(query));
			} else {
				System.out.println(0);
			}

		}
	}

	// Worst O(n^2)
	private static void printOccurrences2(String[] stringArray, String[] queryArray) {
		Map<String, Integer> memoization = new HashMap<>();
		for (String query : queryArray) {
			int cnt = 0;
			if (memoization.containsKey(query)) {
				System.out.println(memoization.get(query));
			} else {
				for (String string : stringArray) {
					if (query.equals(string)) {
						cnt++;
					}
				}
				System.out.println(cnt);
				memoization.put(query, cnt);
			}

		}
	}

}
