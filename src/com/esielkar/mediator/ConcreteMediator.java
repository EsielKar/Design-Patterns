package com.esielkar.mediator;

public class ConcreteMediator implements Mediator {
    private ComponentA componentA;
    private ComponentB componentB;
    private ComponentC componentC;

    public ConcreteMediator() {
        this.componentA = new ComponentA(this);
        this.componentB = new ComponentB(this);
        this.componentC = new ComponentC(this);
    }

    public Object get(char letter) {
        switch (letter) {
            case 'A':
                return componentA;
            case 'B':
                return componentB;
            default:
                return componentC;
        }
    }

    @Override
    public void notify(Object sender, String event) {
        if (sender == componentA) {
            reactOnA();
        } else if (sender == componentB) {
            reactOnB();
        } else if (sender == componentC) {
            reactOnC();
        } else {
            System.out.println("Mediator: reacting to other component");
        }
    }

    private void reactOnA() {
        System.out.println("Mediator react on A");
    }

    private void reactOnB() {
        System.out.println("Mediator react on B");
    }

    private void reactOnC() {
        System.out.println("Mediator react on C");
    }

}
