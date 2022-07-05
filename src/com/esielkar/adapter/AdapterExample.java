package com.esielkar.adapter;

public class AdapterExample {
    public static void main(String[] args) {
        // Adapter - (With Java 8 or higher a lambda expression can be use instead of an
        // inner class or a functional interface)
        Adapter adapter = new Adapter(specialData -> Integer.parseInt(specialData) + 10);

        System.out.println(adapter.method(15));

    }
}
