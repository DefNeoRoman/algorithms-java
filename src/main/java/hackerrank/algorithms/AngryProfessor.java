package hackerrank.algorithms;

import org.junit.Test;

import java.util.Scanner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * https://www.hackerrank.com/challenges/angry-professor
 */
public class AngryProfessor {

	public static boolean isClassCanceled(int students, int threshold, int[] arrivals) {
		int attendance = 0;
		for (int arrival : arrivals) {
			if (arrival <= 0) {
				attendance++;
			}
		}
		if (attendance < threshold) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine(); // consumes '\n' character

		for (int idx = 0; idx < t; idx++) {
			int n = input.nextInt();
			int k = input.nextInt();
			input.nextLine(); // consumes '\n' character

			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = input.nextInt();
			}

			if (isClassCanceled(n, k, arr)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	@Test
	public void test() {
		assertTrue(isClassCanceled(4, 3, new int[]{-1, -3, 4, 2}));
		assertFalse(isClassCanceled(4, 2, new int[]{0, -1, 2, 1}));
	}

}
