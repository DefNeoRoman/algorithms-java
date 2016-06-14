/**
 * https://www.algospot.com/judge/problem/read/TILING2
 * http://algopa.tistory.com/40
 */
package algospot.TILING2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	private static Map<Integer, Integer> memo = new HashMap<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTests = scanner.nextInt();
		while (numOfTests-- > 0) {
			System.out.println(tiling(scanner.nextInt()));
		}
		scanner.close();
	}

	public static int tiling(int width) {
		if (!memo.containsKey(width)) {
			if (width == 0 || width == 1) {
				memo.put(width, 1);
			} else {
				int result = tiling(width - 1) + tiling(width - 2);
				result %= 1000000007;
				memo.put(width, result);
			}
		}
		return memo.get(width);
	}

}

