package com.esielkar.state;

public class Context {
    private BaseState state;

    public Context(BaseState initialState) {
        changeState(initialState);
    }

    public void changeState(BaseState state) {
        this.state = state;
        state.setContext(this);
    }

    public void doThis() {
        state.doThis();
    }

    public void doThat() {
        state.doThat();
    }

}
