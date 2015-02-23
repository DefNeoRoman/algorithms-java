package seo.dale.algorithm.bit;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitMaskerTest {

	@Test
	public void test() {
		int input = 25;
		System.out.println("# Input : " + Integer.toBinaryString(input));
			
		for (int i = 0; i < 32; i++) {
			if (i == 0 || i == 3 || i == 4) {
				assertTrue(BitMasker.isNthOne(input, i));
				assertFalse(BitMasker.isNthZero(input, i));
			} else {
				assertFalse(BitMasker.isNthOne(input, i));
				assertTrue(BitMasker.isNthZero(input, i));
			}
		}
		
		int allToOne = BitMasker.setAllToOne(input);
		System.out.println("# allToOne : " + Integer.toBinaryString(allToOne));
		
		int nthToOne = BitMasker.setNthToOne(input, 1);
		System.out.println("# 1thToOne : " + Integer.toBinaryString(nthToOne));

		int nthToZero = BitMasker.setNthToZero(input, 3);
		System.out.println("# 3thToOne : " + Integer.toBinaryString(nthToZero));
		
		int toggleNth = BitMasker.toggleNth(input, 2);
		System.out.println("# 2thToOne : " + Integer.toBinaryString(toggleNth));
		
		int countOne = BitMasker.countOne(input);
		System.out.println("# countOne : " + countOne);
		
		int countMin = BitMasker.countMin(input);
		System.out.println("# countMin : " + countMin);
	}

}
