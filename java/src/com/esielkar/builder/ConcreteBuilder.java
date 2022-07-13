package com.esielkar.builder;

public class ConcreteBuilder implements Builder {

    private Product product;

    public ConcreteBuilder() {
        reset();
    }

    @Override
    public void reset() {
        product = new Product();
    }

    @Override
    public Builder buildStepA() {
        product.setA(true);
        return this;
    }

    @Override
    public Builder buildStepB() {
        product.setB(true);
        return this;
    }

    @Override
    public Builder buildStepC() {
        product.setC(true);
        return this;
    }

    public Product build() {
        return product;
    }

}
