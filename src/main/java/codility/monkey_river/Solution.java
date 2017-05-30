package codility.monkey_river;

import java.util.*;

/**
 * https://codility.com/tasks/monkey_river/
 * https://codility.com/tickets/try86D9YH-JVX/
 */
public class Solution {

	public int solution(int[] timesByPos, int D) {
		int[] possbyTime = new int[timesByPos.length + 1];
		Arrays.fill(possbyTime, -1);
		for (int pos = 0; pos < timesByPos.length; pos++) {
			int time = timesByPos[pos];
			if (time == -1) {
				continue;
			}
			possbyTime[time] = pos;
		}

		SortedSet<Integer> stones = new TreeSet<>();
		stones.addAll(Arrays.asList(-1, timesByPos.length));
		for (int time = 0; time < possbyTime.length; time++) {
			int pos = possbyTime[time];
			if (pos == -1) {
				continue;
			}
			stones.add(pos);

			int maxDis = 0;
			List<Integer> snapshot = new ArrayList<>(stones);
			for (int i = 1; i < snapshot.size(); i++) {
				int dis = snapshot.get(i) - snapshot.get(i - 1);
				maxDis = Math.max(maxDis, dis);
			}
			if (maxDis <= D) {
				return time;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{3, 2, 1}, 1)); // 3
		System.out.println(s.solution(new int[]{1, -1, 0, 2, 3, 5}, 3)); // 2
		System.out.println(s.solution(new int[]{1, 2, 3, 4, -1, -1, -1}, 3)); // -1
	}

}
