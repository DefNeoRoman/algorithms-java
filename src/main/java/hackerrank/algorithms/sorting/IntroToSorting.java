package hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/tutorial-intro
 */
public class IntroToSorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int toFind = input.nextInt();
		int length = input.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println(searchArrayTofindIndex(toFind, length, array));
	}

	public static int searchArrayTofindIndex(int toFind, int length, int[] array) {
		for (int i = 0; i < length; i++) {
			if (toFind == array[i]) {
				return i;
			}
		}
		return -1;
	}

	@Test
	public void test() {
		assertEquals(1, searchArrayTofindIndex(4, 6, new int[]{1, 4, 5, 7, 9, 12}));
	}


}
