package interviewcake.SingleRifleCheck;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * https://www.interviewcake.com/question/java/single-rifle-check?utm_source=weekly_email
 */
public class SingleRifleCheckAgain {

    @Test
    public void test() {
        int[] half1 = {1, 2, 3, 8, 9};
        int[] half2 = {0, 4, 5, 6, 7};
        int[] shuffled = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertTrue(check(half1, half2, shuffled));
    }

    @Test
    public void test2() {
        int[] half1 = {1, 2, 3, 8, 9};
        int[] half2 = {0, 4, 5, 6, 7};
        int[] shuffled = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertFalse(check(half1, half2, shuffled));
    }

    @Test
    public void test3() {
        int[] half1 = {1, 2, 3, 8, 9, 10};
        int[] half2 = {0, 4, 5, 6, 7};
        int[] shuffled = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertFalse(check(half1, half2, shuffled));
    }

    public static boolean check(int[] half1, int[] half2, int[] shuffled) {
        int index1 = 0;
        int index2 = 0;
        for (int card : shuffled) {
            if (index1 < half1.length && card == half1[index1]) {
                System.out.printf("The card %d is at %d in half1.\n", card, index1);
                index1++;
            } else if (index2 < half2.length && card == half2[index2]) {
                System.out.printf("The card %d is at %d in half2.\n", card, index2);
                index2++;
            } else {
                System.out.printf("The card %d is not found.\n", card);
                return false;
            }
        }

        if (index1 == half1.length && index2 == half2.length) {
            return true;
        } else {
            System.out.println("Some cards are left on either of the halves.");
            return false;
        }
    }

}
