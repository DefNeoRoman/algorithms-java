package codility.holiday_advisor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
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
		Set<Integer> locations = IntStream.of(A).boxed().collect(Collectors.toSet());
		Map<Integer, Integer> counter = new HashMap<>();

		int shortest = A.length;
		int low = 0;
		for (int high = 0; high < A.length; high++) {
			if (counter.size() < locations.size()) {
				counter.put(A[high], counter.getOrDefault(A[high], 0) + 1);
			}

			while (counter.size() == locations.size()) {
				counter.put(A[low], counter.get(A[low]) - 1);
				if (counter.get(A[low]) == 0) {
					counter.remove(A[low]);
					shortest = Math.min(shortest, high - low + 1);
				} else {
					low++;
				}
			}
		}
		return shortest;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{7})); // 1
		System.out.println(s.solution(new int[]{7, 3})); // 2
		System.out.println(s.solution(new int[]{7, 3, 4, 1})); // 4
		System.out.println(s.solution(new int[]{7, 3, 7, 3, 1, 3, 4, 1})); // 5
		System.out.println(s.solution(new int[]{7, 3, 4, 1, 7, 3, 7, 3, 1, 3, 4, 1})); // 4
	}

}
