package com.esielkar.command;

public class CommandExample {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Object param1 = "Param1";
        Command command1 = new Command1(receiver, param1);

        Object param2 = "Param2";
        Command command2 = new Command2(receiver, param2);

        Invoker invoker1 = new Invoker(command1);
        Invoker invoker2 = new Invoker(command2);
        Invoker invoker3 = new Invoker(command1);

        invoker1.executeCommand();
        invoker2.executeCommand();
        invoker3.executeCommand();
    }

}
