package com.esielkar.template_method;

public class ConcreteClass extends AbstractClass {

    @Override
    public void method1() {
        System.out.println("ConcreteClass: method1 execution");

    }

    @Override
    public void method2() {
        System.out.println("ConcreteClass: method2 execution");

    }

    @Override
    public void method3() {
        System.out.println("ConcreteClass: method3 execution");
    }

}
