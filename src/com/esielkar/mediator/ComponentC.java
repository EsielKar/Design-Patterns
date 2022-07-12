package com.esielkar.mediator;

public class ComponentC {
    private Mediator mediator;

    public ComponentC(Mediator mediator) {
        this.mediator = mediator;
    }

    public void operationC() {
        mediator.notify(this, "EventC");
    }
}