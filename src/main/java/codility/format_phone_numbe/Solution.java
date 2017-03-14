package codility.format_phone_numbe;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://codility.com/tasks/format_phone_number/
 * https://codility.com/tickets/try2JAB9V-MBT/
 */
public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("00-44  48 5555 8361")); // 004-448-555-583-61
		System.out.println(sol.solution("0 - 22 1985--324")); // 022-198-53-24
		System.out.println(sol.solution("555372654")); // 555-372-654
	}

	public String solution(String S) {
		Queue<Character> queue = new LinkedList<>();
		for (char ch : S.toCharArray()) {
			if (Character.isDigit(ch)) {
				queue.offer(ch);
			}
		}

		StringBuilder builder = new StringBuilder();
		while (!queue.isEmpty()) {
			if (queue.size() == 4) {
				builder.append('-').append(queue.poll()).append(queue.poll()).append('-').append(queue.poll()).append(queue.poll());
			} else if (queue.size() == 2) {
				builder.append('-').append(queue.poll()).append(queue.poll());
			} else {
				builder.append('-').append(queue.poll()).append(queue.poll()).append(queue.poll());
			}
		}

		return builder.substring(1);
	}

}
