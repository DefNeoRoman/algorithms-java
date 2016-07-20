/**
 * https://www.hackerrank.com/challenges/30-2d-arrays
 */
package hackerrank.tutorials.Day11_2DArrays;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for(int i=0; i < 6; i++){
			for(int j=0; j < 6; j++){
				arr[i][j] = in.nextInt();
			}
		}
		System.out.println(solve(arr));
	}

	public static int solve(int[][] arr) {
		int maxSum = -63;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
						+ arr[i+1][j+1]
						+ arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}

}
