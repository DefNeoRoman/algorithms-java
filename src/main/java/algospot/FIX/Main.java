/**
 * https://www.algospot.com/judge/problem/read/FIX
 */
package algospot.FIX;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		while (cnt-- > 0) {
			int result = 0;
			int length = scanner.nextInt();
			for (int i = 0; i < length; i++) {
				if (i + 1 == scanner.nextInt()) {
					result++;
				}
			}
			System.out.println(result);
		}
	}

}
