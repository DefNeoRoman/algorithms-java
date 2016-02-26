package hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;

/**
 * https://www.hackerrank.com/challenges/correctness-invariant
 */
public class CorrectnessInvariant {

	public static void insertionSort(int[] A){
		for(int i = 1; i < A.length; i++){
			int toInsert = A[i];
			int current = i;
			while(current > 0 && A[current - 1] > toInsert){
				A[current] = A[current - 1];
				current--;
			}
			A[current] = toInsert;
		}
		printArray(A);
	}


	static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++){
			ar[i]=in.nextInt();
		}
		insertionSort(ar);
	}

	@Test
	public void test() {
		int[] array = {4, 1, 3, 5, 6, 2};
		insertionSort(array);
		int[] expected = {1, 2, 3, 4, 5, 6};
		assertArrayEquals(expected, array);
	}

}
