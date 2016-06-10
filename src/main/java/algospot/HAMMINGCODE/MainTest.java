package algospot.HAMMINGCODE;

import org.junit.Test;

import static algospot.HAMMINGCODE.Main.hammingcode;
import static org.junit.Assert.assertEquals;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class MainTest {

	@Test
	public void testHammingcode() throws Exception {
		assertEquals("1011", hammingcode("0100011"));
		assertEquals("1111", hammingcode("1111111"));
	}
}