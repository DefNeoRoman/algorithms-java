package hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/quicksort2
 */
public class Quicksort2Sorting {

	public static List<Integer> quickSort(List<Integer> whole) {
		if (whole.size() <= 1) {
			return whole;
		}

		int pivot = whole.get(0);
		List<Integer> left = new LinkedList<>();
		List<Integer> right = new LinkedList<>();

		for (int i = 1; i <whole.size() ; i++) {
			int value = whole.get(i);
			if (value < pivot) {
				left.add(value);
			} else {
				right.add(value);
			}
		}

		List<Integer> sorted = quickSort(left);
		sorted.add(pivot);
		sorted.addAll(quickSort(right));

		printSubArray(sorted);

		return left;
	}

	public static void printSubArray(List<Integer> sub) {
		for (Integer integer : sub) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		List<Integer> li = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			li.add(input.nextInt());
		}
		quickSort(li);
	}

	@Test
	public void test() {
		List<Integer> result = quickSort(Arrays.asList(5, 8, 1, 3, 7, 9, 2));
		System.out.printf("result : " + result);
	}

}
