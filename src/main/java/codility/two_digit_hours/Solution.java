package codility.two_digit_hours;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://codility.com/tasks/two_digit_hours/
 * https://codility.com/tickets/tryTEVXWN-4YP/
 */
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		// System.out.println(s.solution("15:15:00", "15:15:12")); // 1
		// System.out.println(s.solution("22:22:21", "22:22:23")); // 3
		// System.out.println(s.solution("00:00:12", "00:00:59")); //8
		// System.out.println(s.solution("19:11:19", "19:11:32")); // 1
		System.out.println(s.solution("00:00:00", "23:59:59")); // 504
	}

	public int solution(String S, String T) {
		int count = 0;
		String start = Stream.of(S.split(":")).collect(Collectors.joining());
		String end = Stream.of(T.split(":")).collect(Collectors.joining());
		String current = start;
		while (current.compareTo(end) <= 0) {
			// System.out.println(current);
			if (isInteresting(current)) {
				count++;
			}
			current = next(current);
		}
		return count;
	}

	private boolean isInteresting(String current) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < current.length(); i++) {
			set.add(current.charAt(i));
			if (set.size() > 2) {
				return false;
			}
		}
		return true;
	}

	private String next(String current) {
		int time = Integer.parseInt(current);
		if (time % 10000 == 5959) {
			time += 4041;
		} else if (time % 100 == 59) {
			time += 41;
		} else {
			time += 1;
		}
		return String.format("%06d", time);
	}

}
