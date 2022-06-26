package com.esielkar.prototype;

public class ConcretePrototype implements Prototype, Cloneable {
    public int field; // Primitive type (Not reference)
    public String field2; // Inmmutable Object
    public StringBuilder field3; // Object (Reference)

    public ConcretePrototype(int field, String field2, StringBuilder field3) {
        this.field = field;
        this.field2 = field2;
        this.field3 = field3;
    }

    // Shallow copy - It can do a deep copy instead (Check ConcretePrototype2)
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    // Deep copy - It can do a shallow copy instead (Check ConcretePrototype2)
    @Override
    public Prototype prototype() {
        return new ConcretePrototype(field, field2, new StringBuilder(field3.toString()));
    }

    @Override
    public String toString() {
        return "Field: " + field + " Field2: " + field2 + " Field3: " + field3;
    }

}
