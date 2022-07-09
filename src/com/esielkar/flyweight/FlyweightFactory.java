package com.esielkar.flyweight;

public class FlyweightFactory {
    private static Flyweight[] cache;

    private FlyweightFactory() {

    }

    public static Flyweight[] getFlyweights() {
        return cache;
    }

    public static void setFlyweights(Flyweight[] flyweights) {
        cache = flyweights;
    }

    public static Flyweight getFlyweight(int repeatingState) {
        if (cache[repeatingState] == null) {
            cache[repeatingState] = new Flyweight(repeatingState);
        }

        return cache[repeatingState];
    }
}
