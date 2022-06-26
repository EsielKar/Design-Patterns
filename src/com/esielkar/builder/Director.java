package com.esielkar.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void make(int type) {
        switch (type) {
            case 1:
                builder.buildStepA();
                break;
            case 2:
                builder.buildStepA().buildStepB();
                break;
            default:
                builder.buildStepA().buildStepB().buildStepC();

        }
    }
}
