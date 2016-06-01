package algospot.greedy.MAXSUM;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void testMaxsum() throws Exception {
		int[] array2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		//  {4, −1, 2, 1} => 6
		System.out.println(Main.maxsum(array2));
	}
}