package com.esielkar.bridge;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Platform platform) {
        super(platform);
    }

    public void featureN() {
        platform.method1();
        platform.method2();
        platform.method3();
    }
}
