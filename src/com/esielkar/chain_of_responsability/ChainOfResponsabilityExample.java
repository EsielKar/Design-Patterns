package com.esielkar.chain_of_responsability;

public class ChainOfResponsabilityExample {
    public static void main(String[] args) {
        Handler handler = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler.setNext(handler2);
        handler2.setNext(handler3);

        Object request = 5;
        handler.handle(request);
    }

}