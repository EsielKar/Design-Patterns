package com.esielkar.composite;

import java.util.List;

public class Composite implements Component {
    private static int autoId = 0;

    private int id = ++autoId;

    private List<Component> children;

    public Composite(List<Component> children) {
        this.children = children;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void execute() {
        System.out.println("Composite " + id);
        for (Component component : children) {
            component.execute();
        }

    }

}
