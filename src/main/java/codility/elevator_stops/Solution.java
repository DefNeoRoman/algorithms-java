package codility.elevator_stops;

import java.util.HashSet;
import java.util.Set;

/**
 * https://codility.com/tasks/elevator_stops/
 * https://codility.com/c/run/tryM253A7-Y5Q
 * https://codility.com/tickets/tryM253A7-Y5Q/
 */
public class Solution {
	public int solution(int[] A, int[] B, int M, int X, int Y) {
		if (M == 0 || X == 0 || Y == 0 || A == null || B == null || A.length == 0 || B.length == 0) {
			return 0;
		}
		int length = A.length;
		int total = 0;
		int people = 0, weight = 0;
		int start = 0, end = 0;
		while (end < length) {
			people += 1;
			weight += A[end];
			if (end == length - 1 || people + 1 > X || weight + A[end + 1] > Y) {
				total += countElevatorStops(B, start, end);
				people = 0;
				weight = 0;
				start = end + 1;
			}
			end++;
		}
		return total;
	}

	private int countElevatorStops(int[] B, int start, int end) {
		Set<Integer> floors = new HashSet<>();
		for (int i = start; i <= end; i++) {
			floors.add(B[i]);
		}
		return floors.size() + 1;
	}
}
