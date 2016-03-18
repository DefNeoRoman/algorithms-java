package hackerrank.algorithms.greedy;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

/**
 * https://www.hackerrank.com/challenges/two-arrays
 */
public class TwoArrays {

	@Test
	public void test() {
		String input = "2\n" +
				"3 10\n" +
				"2 1 3\n" +
				"7 8 9\n" +
				"4 5\n" +
				"1 2 2 1\n" +
				"3 3 3 4";
		InputStream is = new ByteArrayInputStream(input.getBytes());
		execute(is);
	}

	public static void main(String[] args) {
		execute(System.in);
	}

	private static void execute(InputStream is) {
		Scanner scanner = new Scanner(is);
		int cnt = scanner.nextInt();
		for (int i = 0; i < cnt; i++) {
			int length = scanner.nextInt();
			int bottom = scanner.nextInt();

			List<Integer> listA = new ArrayList<>();
			for (int j = 0; j < length; j++) {
				listA.add(scanner.nextInt());
			}

			List<Integer> listB = new ArrayList<>();
			for (int j = 0; j < length; j++) {
				listB.add(scanner.nextInt());
			}

			if (isSumGreaterThanBottom(listA, listB, bottom)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean isSumGreaterThanBottom(List<Integer> listA, List<Integer> listB, int bottomSum) {
		Collections.sort(listA);
		Collections.sort(listB, Collections.reverseOrder());

		while (!listA.isEmpty()) {
			int a = listA.get(0);
			int bottomB = bottomSum - a;

			boolean exists = false;
			for (Integer b : listB) {
				if (b >= bottomB) {
					exists = true;
					listA.remove(Integer.valueOf(a));
					listB.remove(Integer.valueOf(b));
					break;
				}
			}

			if (!exists) {
				return false;
			}

		}

		return true;
	}

}
