package plalab.algorithm.hw7;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class BatchSystemTest {

	@Test
	public void testSchedule1() {
		int[] duration = {400, 100, 100, 100};
		String[] user = {"김희민", "서대영", "서대영", "정화수"};
		int[] expected = {3, 1, 2, 0};
		int[] actual = BatchSystem.scheduleDaleSeo(duration, user);
		System.out.println("# wating = " + Arrays.toString(actual));
		assertTrue(Arrays.equals(expected, actual));
	}
	
	@Test
	public void testSchedule2() {
		int[] duration = {400, 100, 100, 100, 400, 100, 100, 100, 500};
		String[] user = {"김희민", "서대영", "서대영", "정화수", "문동선", "문동선", "문동선", "임근대", "정희원"};
		int[] expected = {3, 7, 1, 2, 0, 8, 4, 5, 6};
		int[] actual = BatchSystem.scheduleDaleSeo(duration, user);
		System.out.println("# wating = " + Arrays.toString(actual));
		assertTrue(Arrays.equals(expected, actual));
	}

}
