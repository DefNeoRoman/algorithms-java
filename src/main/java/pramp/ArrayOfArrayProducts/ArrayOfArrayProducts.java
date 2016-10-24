package pramp.ArrayOfArrayProducts;

import java.util.Arrays;

/**
 * https://www.pramp.com/question/7Lg1WA1nZqfoWgPbgM0M
 */
public class ArrayOfArrayProducts {

	public static void main(String[] args) {
		int[] result = new ArrayOfArrayProducts().products(new int[]{2, 7, 3, 4});
		System.out.println(Arrays.toString(result));
	}

	public static int[] products(int[] arr) {
		int[] left = new int[arr.length];
		left[0] = 1;
		for (int i = 0; i < left.length - 1; i++) {
			left[i + 1] = left[i] * arr[i];
		}

		int[] right = new int[arr.length];
		right[right.length - 1] = 1;
		for (int i = right.length - 1; i > 0; i--) {
			right[i - 1] = right[i] * arr[i];
		}

		for (int i = 0; i < left.length; i++) {
			left[i] *= right[i];
		}
		return left;
	}

}
