package com.esielkar.chain_of_responsibility;

public interface Handler {
    public void setNext(Handler handler);

    public void handle(Object request);
}
