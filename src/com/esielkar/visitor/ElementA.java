package com.esielkar.visitor;

public class ElementA implements Element {

    public void featureA() {
        System.out.println("ElementA: featureA");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
