package com.esielkar.observer;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

public class Publisher {
    private Collection<Subscriber> subscribers;

    public Publisher(Class<? extends Collection<Subscriber>> type)
            throws InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        subscribers = type.getDeclaredConstructor().newInstance();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update("Hey, this is a new notification!");
        }
    }

    public void mainBusinessLogic() {
        System.out.println("Main business logic");
    }

}
