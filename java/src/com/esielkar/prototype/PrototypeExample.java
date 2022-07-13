package com.esielkar.prototype;

public class PrototypeExample {

        public static void main(String[] args) throws CloneNotSupportedException {
                Prototype prototype = new ConcretePrototype(1, "2", new StringBuilder("3"));
                Prototype prototype2 = ((ConcretePrototype) prototype).clone();
                Prototype prototype3 = prototype.prototype();

                System.out.println("Concrete Prototype");

                System.out.println("Modifiying field3");
                ((ConcretePrototype) prototype).field3.append("Copy");

                System.out.println("Original");
                System.out.println(prototype);
                System.out.println("Shallow copy");
                System.out.println(prototype2);
                System.out.println("Deep copy");
                System.out.println(prototype3);
        }
}
