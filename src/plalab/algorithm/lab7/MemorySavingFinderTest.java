package plalab.algorithm.lab7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MemorySavingFinderTest {
	int num = 3;

	@Test
	public void test() {
		for (int i = 0; i < 400000000; ++i) {
			if (i == num)
				continue;
			MemorySavingFinder.read(i);
		}

		assertEquals(num, MemorySavingFinder.getFail());
	}
	
}
