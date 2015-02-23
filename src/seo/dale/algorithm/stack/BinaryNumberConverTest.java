package seo.dale.algorithm.stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryNumberConverTest {

	@Test
	public void test() {
		assertEquals("0", BinaryNumberConver.convert("0"));
		assertEquals("1", BinaryNumberConver.convert("1"));
		assertEquals("10", BinaryNumberConver.convert("2"));
		assertEquals("111011", BinaryNumberConver.convert("59"));
	}

}
