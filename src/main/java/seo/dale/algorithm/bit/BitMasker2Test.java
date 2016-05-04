package seo.dale.algorithm.bit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author 서대영/Store기술개발팀/SKP
 */
public class BitMasker2Test {

	@Test
	public void testGetBit() throws Exception {
		assertFalse(BitMaker2.getBit(10, 0)); // 0
		assertTrue(BitMaker2.getBit(10, 1)); // 1
		assertFalse(BitMaker2.getBit(10, 2)); // 0
		assertTrue(BitMaker2.getBit(10, 3)); // 1
	}

	@Test
	public void testClearBit() throws Exception {
		assertEquals(10, BitMaker2.clearBit(10, 0)); // 1010
		assertEquals(8, BitMaker2.clearBit(10, 1)); // 1000
		assertEquals(10, BitMaker2.clearBit(10, 2)); // 1010
		assertEquals(2, BitMaker2.clearBit(10, 3)); // 0010
	}

	@Test
	public void testClearBitsMSBthroughI() throws Exception {
		assertEquals(0, BitMaker2.clearBitsMSBthroughI(10, 0)); // 0000
		assertEquals(0, BitMaker2.clearBitsMSBthroughI(10, 1)); // 0000
		assertEquals(2, BitMaker2.clearBitsMSBthroughI(10, 2)); // 0010
		assertEquals(2, BitMaker2.clearBitsMSBthroughI(10, 3)); // 0010
	}

	@Test
	public void testClearBitsIthrough0() throws Exception {
		assertEquals(10, BitMaker2.clearBitsIthrough0(10, 0)); // 1010
		assertEquals(8, BitMaker2.clearBitsIthrough0(10, 1)); // 1000
		assertEquals(8, BitMaker2.clearBitsIthrough0(10, 2)); // 1000
		assertEquals(0, BitMaker2.clearBitsIthrough0(10, 3)); // 0000
	}


	@Test
	public void testName() throws Exception {
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(Integer.toBinaryString(-3));
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE + 3));
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println(Integer.toBinaryString(-1 >> 5));
		System.out.println(Integer.toBinaryString(-1 >>> 5));
	}

}