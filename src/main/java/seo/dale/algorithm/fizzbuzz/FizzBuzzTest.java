package seo.dale.algorithm.fizzbuzz;

import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    @Test
    public void test() {
        List<String> list = FizzBuzz.fizzBuzz(100);
        System.out.println(list);
    }

    @Test
    public void test2() {
        List<String> list = FizzBuzz.fizzBuzz2(100);
        System.out.println(list);
    }

}