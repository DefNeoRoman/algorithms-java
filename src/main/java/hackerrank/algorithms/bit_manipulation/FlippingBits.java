package hackerrank.algorithms.bit_manipulation;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/flipping-bits
 */
public class FlippingBits {

    @Test
    public void test() {
        String input = "3\n" +
                "2147483647\n" +
                "1\n" +
                "0";
        execute(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        execute(System.in);
    }

    private static void execute(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            long num = scanner.nextLong();
            long flipped = flip(num);
            System.out.println(flipped);
        }
    }

    private static long flip(long num) {
        long intMax = (1L << 32) - 1;
        return intMax - num; // ntMax ^ num
    }

}
