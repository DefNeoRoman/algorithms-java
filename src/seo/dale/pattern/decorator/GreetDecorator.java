package seo.dale.pattern.decorator;

public class GreetDecorator extends Greeter {

    private Greeter greeter;

    public GreetDecorator(Greeter greeter) {
        this.greeter = greeter;
    }

    @Override
    public String greet() {
        return "What's up!! " + greeter.greet();
    }
}
