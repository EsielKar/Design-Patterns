package com.esielkar.prototype;

public class ConcretePrototype2 implements Prototype, Cloneable {
    public int field; // Primitive type (Not reference)
    public String field2; // Inmmutable Object
    public StringBuilder field3; // Object (Reference)

    public ConcretePrototype2(int field, String field2, StringBuilder field3) {
        this.field = field;
        this.field2 = field2;
        this.field3 = field3;
    }

    // Deep copy - It can do a shallow copy instead (Check ConcretePrototype)
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return new ConcretePrototype2(field, field2, new StringBuilder(field3.toString()));
    }

    // Shallow copy - It can do a deep copy instead (Check ConcretePrototype)
    @Override
    public Prototype prototype() {
        // Both lines do the same, but when using the clone method a
        // CloneNotSupportedException can occur
        // return (Prototype) super.clone();
        return new ConcretePrototype2(field, field2, field3);
    }

}
