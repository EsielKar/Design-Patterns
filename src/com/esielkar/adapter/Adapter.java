package com.esielkar.adapter;

public class Adapter implements ExistingInterface {
    // Java 8 or higher - Lambdas
    private final Service adaptee;

    public Adapter(Service adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public final int method(int data) {
        return adaptee.method(String.valueOf(data));

    }

}
