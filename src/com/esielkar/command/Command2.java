package com.esielkar.command;

public class Command2 implements Command {
    private Receiver receiver;
    private Object param;

    public Command2(Receiver receiver, Object param) {
        this.receiver = receiver;
        this.param = param;
    }

    @Override
    public void execute() {
        receiver.operation(param);
    }

}
