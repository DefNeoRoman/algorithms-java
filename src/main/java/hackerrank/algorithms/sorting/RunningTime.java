package hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/runningtime
 */
public class RunningTime {

	public static void insertionSort(int[] A){
		int numOfShifts = 0;
		for(int i = 1; i < A.length; i++){
			int toInsert = A[i];
			int current = i;
			while(current > 0 && A[current - 1] > toInsert){
				A[current] = A[current - 1];
				current--;
				numOfShifts++;
			}
			A[current] = toInsert;
		}
		System.out.println(numOfShifts);
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
		insertionSort(new int[]{2, 1, 3, 1, 2});
	}

}
