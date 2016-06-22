/**
 * https://www.algospot.com/judge/problem/read/MATCHORDER
 */
package algospot.MATCHORDER;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {

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

		int maxOfMine = mine[0];
		int minLose = 0;
		for (int i = 0; i < length; i++) {
			if (yours[i] > maxOfMine) {
				minLose++;
			} else {
				break;
			}
		}

		int maxWin = 0;
		int myIdx = 0;

		for (int yourIdx = 0 + minLose; yourIdx < length; yourIdx++) {
			if (yours[yourIdx] <= mine[myIdx]) {
				maxWin++;
				myIdx++;
			}
		}

		return maxWin;
	}

}
