package seo.dale.pattern.singleton;

import org.junit.Test;

public class Singleton3Test {

    @Test
    public void test() {
        Singleton3 singleton = Singleton3.INSTANCE;
        singleton.method();
    }

}