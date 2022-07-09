package com.esielkar.decorator;

public class ConcreteDecorator2 extends BaseDecorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("Execute from ConcreteDecorator2");
    }

}
