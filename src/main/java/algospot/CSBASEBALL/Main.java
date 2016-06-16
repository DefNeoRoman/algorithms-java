/**
 * https://www.algospot.com/judge/problem/read/CSBASEBALL
 */
package algospot.CSBASEBALL;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		while (cnt-- > 0) {
			int mine = scanner.nextInt();
			int yours = scanner.nextInt();

			if (mine > yours) {
				System.out.println(0);
			} else {
				System.out.println(yours - mine + 4);
			}
		}
	}

}
