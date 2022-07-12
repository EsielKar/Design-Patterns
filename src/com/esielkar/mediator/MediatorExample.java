package com.esielkar.mediator;

public class MediatorExample {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ComponentA componentA = (ComponentA) mediator.get('A');
        ComponentB componentB = (ComponentB) mediator.get('B');
        ComponentC componentC = (ComponentC) mediator.get('C');

        componentA.operationA();
        componentB.operationB();
        componentC.operationC();

    }

}
