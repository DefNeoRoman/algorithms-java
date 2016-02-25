package hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class QuickSort1Partition {

	public static void printPartition(int[] arr) {
		int pivot = arr[0];
		List<Integer> left = new LinkedList<>();
		List<Integer> right = new LinkedList<>();

		for (int i : arr) {
			if (i < pivot) {
				left.add(i);
			} else {
				right.add(i);
			}
		}

		left.addAll(right);
		for (Integer integer : left) {
			System.out.print(integer + " ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = input.nextInt();
		}
		printPartition(ar);
	}

	@Test
	public void test() {
		printPartition(new int[]{4, 5, 3, 7, 2});
	}

}
