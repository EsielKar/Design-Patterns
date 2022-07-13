package com.esielkar.flyweight;

public class Flyweight {
    private final int repeatingState;

    public Flyweight(int repeatingState) {
        this.repeatingState = repeatingState;
    }

    public void operation(int uniqueState) {
        System.out.println("Flyweight: uniqueState = " + uniqueState);
    }

    @Override
    public String toString() {
        return "Flyweight: repeatingState = " + repeatingState;
    }
}
