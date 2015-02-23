package topcoder;

import static org.junit.Assert.*;

import org.junit.*;

public class SmartWorldToyHelperTest {
	
	private SmartWorldToyHelper helper;
	
	@Before
	public void setUp() {
		helper = new SmartWorldToyHelper();
	}

	@Test
	public void testChangeLetterAt1() {
		String str = "aaaa";
		
		String[] next = {"baaa", "abaa", "aaba", "aaab"};
		String[] previous = {"zaaa", "azaa", "aaza", "aaaz"};
		
		for (int i = 0; i < 4; i++) {
			assertEquals(next[i], helper.changeLetterAt(str, i, true));
			assertEquals(previous[i], helper.changeLetterAt(str, i, false));
		}
	}
	
	
	@Test
	public void testChangeLetterAt2() {
		String str = "zzzz";
		
		String[] next = {"azzz", "zazz", "zzaz", "zzza"};
		String[] previous = {"yzzz", "zyzz", "zzyz", "zzzy"};
		
		for (int i = 0; i < 4; i++) {
			assertEquals(next[i], helper.changeLetterAt(str, i, true));
			assertEquals(previous[i], helper.changeLetterAt(str, i, false));
		}
	}
	
	@Test
	public void testIsStrForbidden() {
		String[] forbid = {"a a a z", "a a z a"};
		assertTrue(helper.isStrForbidden("aaaz", forbid));
		assertTrue(helper.isStrForbidden("aaza", forbid));
		assertFalse(helper.isStrForbidden("azaa", forbid));
		assertFalse(helper.isStrForbidden("zaaa", forbid));
	}
	
}
