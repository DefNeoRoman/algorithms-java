package codility.holiday_advisor;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * https://codility.com/tasks/holiday_advisor/
 * https://codility.com/tickets/try99ZDRB-SXG/
 * http://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
 * https://stackoverflow.com/questions/5447561/find-shortest-subarray-containing-all-elements/5447601#5447601
 * https://stackoverflow.com/questions/39435568/how-to-find-smallest-subarray-that-contains-all-elements-1-to-k-at-least-once-fo
 */
public class Solution {

	public int solution(int[] A) {
		long distinct = IntStream.of(A).distinct().count();

		Map<Integer, Integer> counters = new HashMap<>();

		int shortest = A.length;
		int low = 0;
		for (int high = 0; high < A.length; high++) {
			if (counters.size() < distinct) {
				counters.put(A[high], counters.getOrDefault(A[high], 0) + 1);
			}

			while (counters.size() == distinct) {
				counters.put(A[low], counters.get(A[low]) - 1);
				if (counters.get(A[low]) == 0) {
					shortest = Math.min(shortest, high - low + 1);
					counters.remove(A[low]);
				}
				low++;
			}
		}

		return shortest;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{7})); // 1
		System.out.println(s.solution(new int[]{7, 3})); // 2
		System.out.println(s.solution(new int[]{7, 3, 4, 1})); // 4
		System.out.println(s.solution(new int[]{7, 3, 7, 3, 1, 3, 4})); // 5
		System.out.println(s.solution(new int[]{7, 3, 1, 3, 4, 7, 3})); // 4
		System.out.println(s.solution(new int[]{7, 3, 7, 3, 1, 3, 4, 1})); // 5
		System.out.println(s.solution(new int[]{7, 3, 4, 1, 7, 3, 7, 3, 1, 3, 4, 1})); // 4
		System.out.println(s.solution(new int[]{7, 3, 7, 3, 1, 3, 3, 4, 1, 7, 3, 7, 3, 1, 3, 4, 1})); // 4
	}

}
