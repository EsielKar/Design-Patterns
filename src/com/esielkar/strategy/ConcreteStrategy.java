package com.esielkar.strategy;

public class ConcreteStrategy implements Strategy {

    @Override
    public void execute(Object data) {
        System.out.println("Concrete Strategy: " + data);
    }

}
