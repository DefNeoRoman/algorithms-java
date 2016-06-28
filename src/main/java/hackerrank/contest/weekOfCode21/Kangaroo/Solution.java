/**
 * https://www.hackerrank.com/contests/w21/challenges/kangaroo
 */
package hackerrank.contest.weekOfCode21.Kangaroo;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		if (kangaroo(x1, v1, x2, v2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}

	public static boolean kangaroo(int x1, int v1, int x2, int v2) {
		while (true) {
			// System.out.println("x1 = [" + x1 + "], x2 = [" + x2 + "]");
			if (x1 == x2) {
				return true;
			}
			if ((x1 < x2 && v1 < v2) || (x1 > x2 && v1 > v2)) {
				return false;
			}
			x1 += v1;
			x2 += v2;
		}
	}

}
