package com.esielkar.template_method;

public abstract class AbstractClass {
    public final void templateMethod() {
        method1();
        method2();
        hook1();
        method3();
        method4();
    }

    public abstract void method1();

    public abstract void method2();

    public void hook1() {
    }

    public abstract void method3();

    public void method4() {
        System.out.println("AbstractClass: method4 execution");
    }

}
