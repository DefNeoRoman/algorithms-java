/**
 * https://www.hackerrank.com/contests/w21/challenges/luck-balance
 */
package hackerrank.contest.weekOfCode21.LuckBalance;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int cnt = in.nextInt();
		int loseLimit = in.nextInt();
		int[] lucks = new int[cnt];
		int[] importances = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			lucks[i] = in.nextInt();
			importances[i] = in.nextInt();
		}
		System.out.println(solve(cnt, loseLimit, lucks, importances));
		in.close();
	}

	public static int solve(int cnt, int loseLimit, int[] lucks, int[] importances) {
		int maxLuck = 0;
		List<Integer> importantLucks = new LinkedList<>();

		for (int i = 0; i < cnt; i++) {
			if (importances[i] == 0) {
				maxLuck += lucks[i];
			} else {
				importantLucks.add(lucks[i]);
			}
		}

		Collections.sort(importantLucks, Collections.reverseOrder());

		while (loseLimit-- > 0) {
			maxLuck += importantLucks.remove(0);
		}

		while (!importantLucks.isEmpty()) {
			maxLuck -= importantLucks.remove(0);
		}

		return maxLuck;
	}

}
