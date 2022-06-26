package com.esielkar.abstract_factory;

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }

    @Override
    public String toString() {
        return "Concrete Factory 2";
    }

}
