package seo.dale.pattern.decorator;

import org.junit.Test;

public class GreeterTest {

    @Test
    public void test() {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet());
        Greeter greeterDecorator = new GreetDecorator(greeter);
        System.out.println(greeterDecorator.greet());
        Greeter doubleGreeterDecorator = new GreetDecorator(greeterDecorator);
        System.out.println(doubleGreeterDecorator.greet());
    }

}