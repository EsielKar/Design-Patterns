package com.esielkar.bridge;

public class BridgeExample {
    public static void main(String[] args) {
        Platform platform = new ConcretePlatform();
        Abstraction abstraction = new Abstraction(platform);
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(platform);

        abstraction.feature1();
        abstraction.feature2();

        refinedAbstraction.featureN();

    }
}
