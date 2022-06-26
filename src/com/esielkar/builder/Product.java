package com.esielkar.builder;

public class Product {
    private boolean a;
    private boolean b;
    private boolean c;

    public void setA(boolean a) {
        this.a = a;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "A: " + a + " B: " + b + " C: " + c;
    }

}
