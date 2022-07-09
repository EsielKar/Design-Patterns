package com.esielkar.decorator;

public final class ConcreteComponent implements Component {

    @Override
    public void execute() {
        System.out.println("Execute from ConcreteComponent");
    }

}
