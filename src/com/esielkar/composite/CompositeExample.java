package com.esielkar.composite;

import java.util.ArrayList;

public class CompositeExample {
    public static void main(String[] args) {
        Composite composite = new Composite(new ArrayList<>()); // Composite 1
        Composite innerComposite = new Composite(new ArrayList<>()); // Composite 2

        composite.add(new Leaf()); // Leaf 1

        innerComposite.add(new Leaf()); // Leaf 2
        innerComposite.add(new Leaf()); // Leaf 3

        composite.add(innerComposite);
        composite.execute();

    }
}
