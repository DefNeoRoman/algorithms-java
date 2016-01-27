package seo.dale.pattern.singleton;

/**
 * Using Static Factory Method
 */
public class Singleton2 {

    private static Singleton2 INSTANCE;

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

    private Singleton2() {
    }

    public void method() {
        System.out.println("method");
    }

}
