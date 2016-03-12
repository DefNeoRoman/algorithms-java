package interviewcake;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * https://www.interviewcake.com/question/java/shuffle?utm_source=weekly_email
 * https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
 */
public class Shuffle {

    public void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = getRandom(i, array.length - 1);

            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }

    public int getRandom(int floor, int ceiling) {
        Random random = new Random();
        return random.nextInt((ceiling - floor) + 1) + floor;
    }

    @Test
    public void test() {
        int[] input = {1, 2, 3, 4, 5};
        for (int i = 0; i < 10; i++) {
            shuffle(input);
            System.out.println(Arrays.toString(input));
        }
    }

}
