package com.esielkar.template_method;

public class ConcreteClass2 extends AbstractClass {

    @Override
    public void method1() {
        System.out.println("ConcreteClass2: method1 execution");

    }

    @Override
    public void method2() {
        System.out.println("ConcreteClass2: method2 execution");

    }

    @Override
    public void hook1() {
        super.hook1();
        System.out.println("ConcreteClass2: hook1 execution");
    }

    @Override
    public void method3() {
        System.out.println("ConcreteClass2: method3 execution");
    }

}
