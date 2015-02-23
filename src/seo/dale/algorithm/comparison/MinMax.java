package seo.dale.algorithm.comparison;

public class MinMax {
	
	public static int min(int x, int y) {
		return x < y ? x : y;
	}
	
	public static int max(int x, int y) {
		return x > y ? x : y;
	}

	public static int maxArr(int[] arr) {
		int max = Integer.MIN_VALUE;
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int maxArrRecursion(int[] arr, int length) {
		if (length == 1) {
			return arr[0];
		} else {
			return max(arr[length - 1], maxArrRecursion(arr, length - 1));
		}
	}
	
}
