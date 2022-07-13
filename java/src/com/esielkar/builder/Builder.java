package com.esielkar.builder;

public interface Builder {
    public void reset();

    public Builder buildStepA();

    public Builder buildStepB();

    public Builder buildStepC();
}
