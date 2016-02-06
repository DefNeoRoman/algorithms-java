package seo.dale.pattern.singleton;

import org.junit.Test;

public class Singleton1Test {

    @Test
    public void test() {
        Singleton1 singleton = Singleton1.INSTANCE;
        singleton.method();
    }

}