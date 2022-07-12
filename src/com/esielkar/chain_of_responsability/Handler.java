package com.esielkar.chain_of_responsability;

public interface Handler {
    public void setNext(Handler handler);

    public void handle(Object request);
}
