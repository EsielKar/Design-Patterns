package com.esielkar.observer;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;

public class ObserverExample {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Publisher publisher = new Publisher((Class<? extends Collection<Subscriber>>) LinkedList.class);

        Subscriber subscriber = new ConcreteSubscriber();
        Subscriber subscriber2 = new ConcreteSubscriber();
        Subscriber subscriber3 = new ConcreteSubscriber();

        System.out.println("Notifiying all subscribers");
        publisher.subscribe(subscriber);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);
        publisher.notifySubscribers();

        System.out.println("Notifiying remaining subscribers");
        publisher.unsubscribe(subscriber3);
        publisher.notifySubscribers();

    }
}
