package CtCI.Ch08_RecursionAndDynamicProgramming.Q8_03_Magic_Index;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 변형된 문제 : 원소들이 서로 다른 값을 갖는다는 조건이 없다면?
 */
public class MySolution2 {

	@Test
	public void test3() {
		int[] array = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
		assertEquals(2, findMagicIndex(array));
	}

	/**
	 * binary search : O(logN)
	 */
	public static int findMagicIndex(int[] array) {
		return findMagicIndexRecursively(array, 0, array.length - 1);
	}

	public static int findMagicIndexRecursively(int[] array, int low, int high) {
		if (low < 0 || high >= array.length || low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		System.out.println("low = [" + low + "], mid = [" + mid + "], high = [" + high + "]");
		if (mid == array[mid]) {
			return mid;
		}

		int lowEnd = Math.min(mid - 1, array[mid]);
		int lowMagic = findMagicIndexRecursively(array, low, lowEnd);
		if (lowMagic >= 0) {
			return lowMagic;
		}

		int highStart = Math.max(mid + 1, array[mid]);
		int highMagic = findMagicIndexRecursively(array, highStart, high);

		return highMagic;
	}


}
