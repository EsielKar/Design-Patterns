package com.esielkar.strategy;

public class StrategyExample {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategy());

        context.doSomething();

    }
}
