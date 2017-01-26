package CtCI.Ch05_BitManipulation.Q5_07_Pairwise_Swap;

import CtCI.CtCILibrary.AssortedMethods;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2005.%20Bit%20Manipulation/Q5_07_Pairwise_Swap/Question.java
 */
public class Question {

    public static int swapOddEvenBits(int x) {
        return (x & 0xAAAAAAAA) >>> 1 | (x & 0x55555555) << 1;
    }

    public static void main(String[] args) {
        int a = 234321;
        System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
        int b = swapOddEvenBits(a);
        System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
    }

}
