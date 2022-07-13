package com.esielkar.decorator;

public class BaseDecorator implements Component {
    protected Component wrapee;

    public BaseDecorator(Component component) {
        wrapee = component;
    }

    @Override
    public void execute() {
        wrapee.execute();
        // System.out.println("Execute from BaseDecorator");
    }

}
