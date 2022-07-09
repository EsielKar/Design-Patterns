package com.esielkar.flyweight;

public class Context {
    private int uniqueState;
    private Flyweight flyweight;

    public Context(int repeatingState, int uniqueState) {
        this.uniqueState = uniqueState;
        flyweight = FlyweightFactory.getFlyweight(repeatingState);
    }

    public void operation() {
        flyweight.operation(uniqueState);
    }

    public boolean hasFlyweight(Flyweight flyweight) {
        return this.flyweight == flyweight;
    }

    @Override
    public String toString() {
        return "Context: uniqueState = " + uniqueState + " " + flyweight;
    }

}
