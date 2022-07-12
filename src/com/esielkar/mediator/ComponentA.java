package com.esielkar.mediator;

public class ComponentA {
    private Mediator mediator;

    public ComponentA(Mediator mediator) {
        this.mediator = mediator;
    }

    public void operationA() {
        mediator.notify(this, "EventA");
    }
}
