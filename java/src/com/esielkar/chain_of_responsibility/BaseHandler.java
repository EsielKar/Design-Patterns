package com.esielkar.chain_of_responsibility;

public abstract class BaseHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Object request) {
        if (next != null) {
            next.handle(request);
        }
    }

}
