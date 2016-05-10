package seo.dale.algorithm.recursion.binary;

import org.junit.Test;

import java.util.Arrays;

/**
 * n 개의 자리수로 이뤄진 모든 비트의 경우의 수를 나열하시오
 */
public class Binary {

	public static void binary(int n, int[] arr) {
		if (n < 1) {
			System.out.println(Arrays.toString(arr));
		} else {
			arr[n - 1] =  0;
			binary(n - 1, arr);
			arr[n - 1] = 1;
			binary(n - 1, arr);
		}
	}

	@Test
	public void test() {
		binary(3, new int[3]);
	}

}
