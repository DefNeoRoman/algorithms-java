package backjoon.p10797;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/6359
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTests = scanner.nextInt();
		for (int i = 0; i < numOfTests; i++) {
			int numOfDoors = scanner.nextInt();
			boolean[] doors = new boolean[numOfDoors];
			toggleDoors(doors);
			int count = countOpenDoors(doors);
			System.out.println(count);
		}
	}

	public static void toggleDoors(boolean[] doors) {
		int roundCnt = doors.length;
		for (int round = 0; round < roundCnt; round++) {
			for (int toggleIdx = round; toggleIdx < roundCnt; toggleIdx += round + 1) {
				doors[toggleIdx] = !doors[toggleIdx];
			}
		}
	}

	public static int countOpenDoors(boolean[] doors) {
		int count = 0;
		for (boolean door : doors) {
			if (door) {
				count++;
			}
		}
		return count;
	}

}
