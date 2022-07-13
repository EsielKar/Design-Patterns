package com.esielkar.observer;

public class ConcreteSubscriber implements Subscriber {
    private static int ID = 0;
    private int id = ++ID;

    @Override
    public void update(Object context) {
        System.out.println("Concrete Subscriber " + id + " New update: " + context);

    }

}
