/**
 * https://www.algospot.com/judge/problem/read/STRJOIN
 */
package algospot.STRJOIN;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		while (cnt-- > 0) {
			int length = scanner.nextInt();
			List<Integer> list = new LinkedList<>();
			for (int i = 0; i < length; i++) {
				list.add(scanner.nextInt());
			}
			System.out.println(strjoin(list));
		}
	}

	public static int strjoin(List<Integer> list) {
		int total = 0;
		while (list.size() > 1) {
			Collections.sort(list);
			int firstMin = list.remove(0);
			int secondMin = list.remove(0);
			int sumOfMins = firstMin + secondMin;
			total += sumOfMins;
			list.add(sumOfMins);
		}
		return total;
	}

}
