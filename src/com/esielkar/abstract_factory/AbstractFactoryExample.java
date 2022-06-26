package com.esielkar.abstract_factory;

public class AbstractFactoryExample {

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();

        final ProductA productA1 = factory1.createProductA();
        final ProductA productA2 = factory2.createProductA();

        final ProductB productB1 = factory1.createProductB();
        final ProductB productB2 = factory2.createProductB();

        System.out.println("Factory: " + factory1);
        System.out.println(productA1);
        System.out.println(productB1);

        System.out.println("Factory: " + factory2);
        System.out.println(productA2);
        System.out.println(productB2);

    }

}