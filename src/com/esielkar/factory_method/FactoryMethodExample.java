package com.esielkar.factory_method;

public class FactoryMethodExample {

    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Creator creatorB = new ConcreteCreatorB();

        creatorA.someOperation();
        creatorB.someOperation();
    }

}