package com.esielkar.state;

public class StateExample {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteState());

        context.doThat();
        context.doThis();

        context.doThis();
        context.doThat();
    }

}
