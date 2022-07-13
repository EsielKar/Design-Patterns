package com.esielkar.chain_of_responsibility;

public class ConcreteHandler2 extends BaseHandler {

    @Override
    public void handle(Object request) {
        if (request instanceof Double) {
            System.out.println("ConcreteHandler2 can handle it: " + request);
        } else {
            System.out.println("ConcreteHandler2 cannot handle it");
            super.handle(request);
        }

    }

}
