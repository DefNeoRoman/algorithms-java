package seo.dale.pattern.singleton;

/**
 * Using Static Field
 */
public class Singleton1 {

    public static Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public void method() {
        System.out.println("method");
    }

}
