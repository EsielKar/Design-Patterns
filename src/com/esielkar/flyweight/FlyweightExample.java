package com.esielkar.flyweight;

import java.util.Comparator;

public class FlyweightExample {
    public static void main(String[] args) {
        // Flyweights
        Flyweight repeatingState1 = new Flyweight(0);
        Flyweight repeatingState2 = new Flyweight(1);
        Flyweight repeatingState3 = new Flyweight(2);
        FlyweightFactory.setFlyweights(new Flyweight[] { repeatingState1, repeatingState2, repeatingState3 });

        // Context
        Context[] contexts = { new Context(2, 22),
                new Context(0, 10),
                new Context(2, 1),
                new Context(0, 2),
                new Context(1, 500) };

        for (Flyweight flyweight : FlyweightFactory.getFlyweights()) {
            System.out.println("--------- " + flyweight + " ---------");
            for (Context context : contexts) {
                System.out.print(context + " ");
                System.out.println(context.hasFlyweight(flyweight));
            }
        }

    }

}