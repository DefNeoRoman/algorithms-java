package algospot.basic.ENDIANS;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://www.algospot.com/judge/problem/read/ENDIANS
 */
public class MainTest {

	@Test
	public void test() {
		long[][] inOutPairs = {
				{2018915346, 305419896},
				{1, 16777216},
				{100000, 2693136640L},
				{4294967295L, 4294967295L}
		};
		for (int i = 0; i < 4; i++) {
			long unsignedInteger = inOutPairs[i][0];
			long reversed = Main.endians(unsignedInteger);
			assertEquals(inOutPairs[i][1], reversed);
		}
	}
	
}