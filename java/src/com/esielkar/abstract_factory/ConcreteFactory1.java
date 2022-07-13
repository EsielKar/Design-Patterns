package com.esielkar.abstract_factory;

public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }

    @Override
    public String toString() {
        return "Concrete Factory 1";
    }

}
