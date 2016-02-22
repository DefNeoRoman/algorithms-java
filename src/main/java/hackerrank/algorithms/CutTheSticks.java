package hackerrank.algorithms;

import org.junit.Test;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/cut-the-sticks
 */
public class CutTheSticks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int cnt = input.nextInt();
		List<Integer> sticks = new ArrayList<>(cnt);
		for (int i = 0; i < cnt; i++) {
			sticks.add(input.nextInt());
		}

		Collections.sort(sticks); // O(n*log(n))
		while (!sticks.isEmpty()) {
			System.out.println(sticks.size());
			operateCut(sticks);
		}
	}

	public static void operateCut(List<Integer> sortedSticks) {
		int smallest = sortedSticks.get(0);

		for (int i = 0; i < sortedSticks.size(); i++) {
			int dif = sortedSticks.get(i) - smallest;
			sortedSticks.set(i, dif);
		}

		while (!sortedSticks.isEmpty() && sortedSticks.get(0) == 0 ) {
			sortedSticks.remove(0);
		}
	}

	@Test
	public void test() {
		List<Integer> sticks = new LinkedList<>();
		sticks.add(5);
		sticks.add(4);
		sticks.add(4);
		sticks.add(2);
		sticks.add(2);
		sticks.add(8);

		Collections.sort(sticks);
		while (!sticks.isEmpty()) {
			System.out.println(sticks);
			operateCut(sticks);
		}
	}

	@Test
	public void test2() {
		List<Integer> sticks = new LinkedList<>();
		sticks.add(1);
		sticks.add(2);
		sticks.add(3);
		sticks.add(4);
		sticks.add(3);
		sticks.add(3);
		sticks.add(2);
		sticks.add(1);

		Collections.sort(sticks);
		while (!sticks.isEmpty()) {
			System.out.println(sticks);
			operateCut(sticks);
		}
	}

}
