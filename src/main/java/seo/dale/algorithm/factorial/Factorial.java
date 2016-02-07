package seo.dale.algorithm.factorial;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Factorial {

    public static long factorial(int n) {
        int ftr = 1;
        while (n > 1) {
            ftr *= n --;
        }
        return ftr;
    }

    @Test
    public void testFactorial() {
        assertEquals(120, factorial(5));
    }

}
