package hackerrank.algorithms.bit_manipulation;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

/**
 * https://www.hackerrank.com/challenges/lonely-integer
 */
public class LonelyInteger {

    @Test
    public void test() {
        String input = "5\n" +
                "0 0 1 2 1";
        execute(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        execute(System.in);
    }

    public static void execute(InputStream in) {
        Scanner scanner = new Scanner(in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // int res = lonelyinteger(array);
        int res = lonelyinteger2(array);
        System.out.println(res);
    }

    static int lonelyinteger(int[] array) {
        List<Integer> list = new LinkedList<>();
        for (int i : array) {
            if (list.contains(i)) {
                list.remove(Integer.valueOf(i));
            } else {
                list.add(i);
            }
        }
        return list.get(0);
    }

    // using bitwise xor
    static int lonelyinteger2(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result ^= array[i];
        }
        return result;
    }

}
