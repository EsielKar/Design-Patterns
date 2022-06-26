package com.esielkar.singleton;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.instance;
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton2);
    }

}