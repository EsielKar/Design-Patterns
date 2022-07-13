package com.esielkar.state;

public abstract class BaseState implements State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

}
