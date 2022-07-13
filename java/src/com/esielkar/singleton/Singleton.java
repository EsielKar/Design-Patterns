package com.esielkar.singleton;

public final class Singleton {

    // instance != instance2

    // It is instantiated from the beginning
    public static final Singleton instance = new Singleton();
    // It is only instantiated when the getInstance method is called.
    public static Singleton instance2;

    private Singleton() {
    }

    // Thread-safe initialization
    public static final synchronized Singleton getInstance() {
        if (instance2 == null)
            instance2 = new Singleton();
        return instance2;
    }

}
