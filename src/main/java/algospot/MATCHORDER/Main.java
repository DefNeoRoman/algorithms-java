/**
 * https://www.algospot.com/judge/problem/read/MATCHORDER
 * http://gwpark.tistory.com/1827
 */
package algospot.MATCHORDER;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	private static int length;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		while (cnt-- > 0) {
			length = scanner.nextInt();
			Integer[] yours = new Integer[length];
			Integer[] mine = new Integer[length];
			for (int i = 0; i < length; i++) {
				yours[i] = scanner.nextInt();
			}
			for (int i = 0; i < length; i++) {
				mine[i] = scanner.nextInt();
			}
			System.out.println(matchorder(yours, mine));
		}
		scanner.close();
	}

	public static int matchorder(Integer[] yours, Integer[] mine) {
		Arrays.sort(yours, Collections.reverseOrder());
		Arrays.sort(mine, Collections.reverseOrder());

		int winCnt = 0;

		int yourIdx = 0;
		int myIdx = 0;

		while (yourIdx < length) {
			if (yours[yourIdx] <= mine[myIdx]) {
				winCnt++;
				myIdx++;
			}
			yourIdx++;
		}

		return winCnt;
	}

}

