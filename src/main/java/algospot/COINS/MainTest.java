package algospot.COINS;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test() {
        assertEquals(2, Main.func(110, Arrays.asList(10, 100)));
    }

    @Test
    public void test1() {
        assertEquals(10, LoggingMain.func(10, Arrays.asList(1, 2, 4, 8)));
    }

    @Test
    public void test2() {
        assertEquals(4, LoggingMain.func(110, Arrays.asList(10, 50, 100, 500)));
    }

    @Test
    public void test3() {
        assertEquals(110, LoggingMain.func(850, Arrays.asList(10, 50, 100, 500)));
    }

    @Test
    public void test4() {
        assertEquals(130, Main.func(3600, Arrays.asList(100, 300, 500, 900, 2000)));
    }

    @Test
    public void test5() {
        System.out.println(Integer.MAX_VALUE);
        assertEquals(873794561, Main.func(1278, Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128)));
    }

}