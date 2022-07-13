package com.esielkar.mediator;

public class ComponentB {
    private Mediator mediator;

    public ComponentB(Mediator mediator) {
        this.mediator = mediator;
    }

    public void operationB() {
        mediator.notify(this, "EventB");
    }
}