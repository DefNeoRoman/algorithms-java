package seo.dale.pattern.singleton;

import org.junit.Test;

public class Singleton2Test {

    @Test
    public void test() {
        Singleton2 singleton = Singleton2.getInstance();
        singleton.method();
    }

}