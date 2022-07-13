package com.esielkar.visitor;

public class ElementB implements Element {

    public void featureB() {
        System.out.println("ElementB: featureB");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

}
