package com.esielkar.decorator;

public class ConcreteDecorator extends BaseDecorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("Execute from ConcreteDecorator");
    }

}
