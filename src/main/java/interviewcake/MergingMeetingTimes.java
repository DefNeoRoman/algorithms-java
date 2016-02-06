package interviewcake;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * https://www.interviewcake.com/question/merging-ranges
 */
public class MergingMeetingTimes {

	public int[][] condenseMeetingTimes(int[][] meetings) {
		Arrays.sort(meetings, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		
		LinkedList<int[]> mergedList = new LinkedList<int[]>();
		mergedList.add(meetings[0]);
		for (int i = 1; i < meetings.length; i++) {
			int[] current = meetings[i];
			int[] previous = mergedList.getLast();
			if (current[0] <= previous[1]) {
				current[0] = previous[0];
				current[1] = Math.max(previous[1], current[1]);
				mergedList.removeLast();
			}
			mergedList.add(current);
		}
		
		return mergedList.toArray(new int[0][2]);
	}
	
}
