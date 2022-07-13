package com.esielkar.state;

public class ConcreteState2 extends BaseState {

    @Override
    public void doThis() {
        System.out.println("ConcreteState2 doThis() (does nothing)");

    }

    @Override
    public void doThat() {
        System.out.println("ConcreteState2 doThat() (changes state to ConcreteState)");
        context.changeState(new ConcreteState());

    }

}
