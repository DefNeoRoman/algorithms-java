package hackerrank.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/bigger-is-greater
 */
public class BiggerIsGreater {

	String nextLexicographical(String word) {
		char[] letters = word.toCharArray();

		int pivot = findPivot(letters);
		if (pivot < 0) {
			return "no answer";
		}

		int target = findRightmostGreaterThanPivot(letters, pivot);
		swap(letters, pivot, target);
		reverse(letters, pivot, letters.length);

		return String.valueOf(letters);
	}

	private static int findPivot(char[] letters) {
		int pivot = letters.length - 1;
		while (pivot > 0 && letters[pivot - 1] >= letters[pivot]) {
			pivot--;
		}
		return pivot - 1;
	}

	private static int findRightmostGreaterThanPivot(char[] letters, int pivot) {
		for (int i = letters.length - 1; i > pivot; i--) {
			if (letters[i] > letters[pivot]) {
				return i;
			}
		}
		return pivot;
	}

	private static void reverse(char[] arr, int from, int to) {
		for (int i = from; i < (from + to) / 2; i++) {
			swap(arr, i, from + to - i - 1);
		}
	}

	private static void swap(char[] arr, int i, int j) {
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	@Test
	public void test() {
		assertEquals("ba", nextLexicographical("ab"));
		assertEquals("no answer", nextLexicographical("bb"));
		assertEquals("hegf", nextLexicographical("hefg"));
		assertEquals("dhkc", nextLexicographical("dhck"));
		assertEquals("hcdk", nextLexicographical("dkhc"));
	}

	@Test
	public void testFindPivot() {
		assertEquals(1, findPivot(new char[]{2, 5, 7, 6, 4, 3, 1}));
	}

	@Test
	public void testFindRightmostGreaterThanPivot() {
		assertEquals(3, findRightmostGreaterThanPivot(new char[]{2, 5, 7, 6, 4, 3, 1}, 1));
		assertEquals(4, findRightmostGreaterThanPivot(new char[]{2, 3, 7, 6, 4, 3, 1}, 1));
		assertEquals(0, findRightmostGreaterThanPivot(new char[]{2, 2}, 0));
	}

	@Test
	public void testReverse() {
		char[] arr = {'2', '5', '7', '6', '4', '3', '1'};

		reverse(arr, 0, arr.length);
		assertArrayEquals(new char[]{'1', '3', '4', '6', '7', '5', '2'}, arr);

		reverse(arr, 2, 5);
		assertArrayEquals(new char[]{'1', '3', '7', '6', '4', '5', '2'}, arr);

		char[] arr2 = {'h', 'k', 'd', 'c'};

		reverse(arr2, 1, arr2.length);
		assertArrayEquals(new char[]{'h', 'c', 'd', 'k'}, arr2);
	}

}
