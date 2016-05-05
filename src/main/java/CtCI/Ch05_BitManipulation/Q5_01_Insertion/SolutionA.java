package CtCI.Ch05_BitManipulation.Q5_01_Insertion;

import CtCI.CtCILibrary.AssortedMethods;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SolutionA {

    public static int insertBits(int n, int m, int i, int j) {
        int leftMask = -1 << (j + 1); // 111111111111110000000
        int rightMask = (1 << i) - 1; // 11
        int mask = leftMask | rightMask;
        System.out.println("- mask : " + Integer.toBinaryString(mask));
        int cleanedN = n & mask;
        System.out.println("- cleaned N : " + Integer.toBinaryString(cleanedN));
        int shiftedM = m << i;
        System.out.println("- shifted M : " + Integer.toBinaryString(shiftedM));
        return cleanedN | shiftedM;
    }

    @Test
    public void test() {
        int n = Integer.parseInt("10000000000", 2);
        int m = Integer.parseInt("10011", 2);
        int i = 2;
        int j = 6;
        assertEquals(Integer.parseInt("10001001100", 2), insertBits(n, m, i, j));
    }

    @Test
    public void test2() {
        int n = Integer.parseInt("10101010101", 2);
        int m = Integer.parseInt("11011", 2);
        int i = 2;
        int j = 6;
        assertEquals(Integer.parseInt("10101101101", 2), insertBits(n, m, i, j));
    }

    @Test
    public void test3() {
        int a = 103217;
        System.out.println(AssortedMethods.toFullBinaryString(a));
        int b = 13;
        System.out.println(AssortedMethods.toFullBinaryString(b));
        int c = insertBits(a, b, 4, 12);
        System.out.println(AssortedMethods.toFullBinaryString(c));
        assertEquals(Integer.parseInt("00000000000000011000000011010001", 2), c);
    }

}
