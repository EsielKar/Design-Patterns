package com.esielkar.state;

public class ConcreteState extends BaseState {

    @Override
    public void doThis() {
        System.out.println("ConcreteState doThis() (changes state to ConcreteState2)");
        context.changeState(new ConcreteState2());

    }

    @Override
    public void doThat() {
        System.out.println("ConcreteState doThat() (does nothing)");
    }

}
