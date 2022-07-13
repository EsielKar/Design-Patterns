package com.esielkar.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        Component stack = new ConcreteComponent();

        stack = new ConcreteDecorator(stack);

        stack = new ConcreteDecorator2(stack);

        stack.execute();

    }
}
