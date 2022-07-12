package com.esielkar.chain_of_responsability;

public class ConcreteHandler extends BaseHandler {

    @Override
    public void handle(Object request) {
        if (request instanceof Integer) {
            System.out.println("ConcreteHandler can handle it: " + request);
        } else {
            System.out.println("ConcreteHandler cannot handle it");
            super.handle(request);
        }

    }

}
