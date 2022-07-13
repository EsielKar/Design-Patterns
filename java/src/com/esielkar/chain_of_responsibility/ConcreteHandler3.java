package com.esielkar.chain_of_responsibility;

public class ConcreteHandler3 extends BaseHandler {

    @Override
    public void handle(Object request) {
        if (request instanceof String) {
            System.out.println("ConcreteHandler3 can handle it: " + request);
        } else {
            System.out.println("ConcreteHandler3 cannot handle it");
            super.handle(request);
        }

    }

}
