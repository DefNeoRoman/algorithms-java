package seo.dale.algorithm.recursion.binary;

import org.junit.Test;

import java.util.Arrays;

public class KString {

	public static int[] arr = new int[5];

	public static void kString(int n, int k) {
		if (n < 1) {
			System.out.println(Arrays.toString(arr));
		} else {
			for (int i = 0; i < k; i++) {
				arr[n - 1] = i;
				kString(n - 1, k);
			}
		}
	}

	@Test
	public void test() {
		kString(5, 3);
	}

}
