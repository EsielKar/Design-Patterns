package com.esielkar.factory_method;

public abstract class Creator {

    public abstract Product createProduct();

    public final void someOperation() {
        Product product = createProduct();
        product.doStuff();
    }

}
