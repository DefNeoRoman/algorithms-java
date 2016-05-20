package CtCI.Ch05_BitManipulation.Q5_04_Next_Number;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Brute Force
 * : 비트 조작이나 수학적인 방법으로는 아직 못하겠음 ㅠㅠ
 */
public class MySolution {

	@Test
	public void test() {
		assertEquals(3, getPrevious(5));
		assertEquals(6, getNext(5));

		assertEquals(8, getPrevious(16));
		assertEquals(32, getNext(16));
	}

	public static int getPrevious(int n) {
		int numOfOnes = countOnes(n);
		while (n >= 0) {
			n--;
			if (numOfOnes == countOnes(n)) {
				System.out.println("Found previous!");
				return n;
			}
		}
		return -1;
	}

	public static int getNext(int n) {
		int numOfOnes = countOnes(n);
		while (n <= Integer.MAX_VALUE) {
			n++;
			if (numOfOnes == countOnes(n)) {
				System.out.println("Found next!");
				return n;
			}
		}
		return -1;
	}

	@Test
	public void testCountOnes() {
		assertEquals(2, countOnes(3));
		assertEquals(2, countOnes(5));
		assertEquals(2, countOnes(6));

		assertEquals(1, countOnes(8));
		assertEquals(1, countOnes(16));
		assertEquals(1, countOnes(32));
	}

	private static int countOnes(int n) {
		System.out.println(".countOnes = [" + n + "]");
		int count = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				count++;
			}
			n /= 2;
		}
		return count;
	}


}
