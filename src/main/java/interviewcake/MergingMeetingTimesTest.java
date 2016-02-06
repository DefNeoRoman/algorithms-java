package interviewcake;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergingMeetingTimesTest {

	MergingMeetingTimes mergingMeetingTimes = new MergingMeetingTimes();
	
	@Test
	public void test1() {
		int[][] ranges = {{1, 2}, {2, 3}};
		int[][] expected = {{1, 3}};
		int[][] actual = mergingMeetingTimes.condenseMeetingTimes(ranges);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		int[][] ranges = {{1, 5}, {2, 3}};
		int[][] expected = {{1, 5}};
		int[][] actual = mergingMeetingTimes.condenseMeetingTimes(ranges);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		int[][] ranges = {{0, 1}, {3, 5}, {4, 8}, {10, 12}, {9, 10}};
		int[][] expected = {{0, 1}, {3, 8}, {9, 12}};
		int[][] actual = mergingMeetingTimes.condenseMeetingTimes(ranges);
		assertArrayEquals(expected, actual);
	}

}
