package com.esielkar.composite;

public final class Leaf implements Component {
    private static int autoId = 0;

    private int id = ++autoId;

    @Override
    public void execute() {
        System.out.println("Leaf " + id + " - Does work");
    }

}
