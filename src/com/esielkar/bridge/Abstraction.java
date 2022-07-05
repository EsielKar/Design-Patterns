package com.esielkar.bridge;

public class Abstraction {
    protected Platform platform;

    public Abstraction(Platform platform) {
        this.platform = platform;
    }

    public void feature1() {
        platform.method1();
        platform.method2();
    }

    public void feature2() {
        platform.method3();
    }

}
