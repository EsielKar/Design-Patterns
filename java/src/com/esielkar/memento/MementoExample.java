package com.esielkar.memento;

import java.util.ArrayDeque;
import java.util.Deque;

import com.esielkar.memento.Originator.Memento;

public class MementoExample {
    public static void main(String[] args) {
        Memento snapshot;
        Originator originator = new Originator();
        Deque<Memento> history = new ArrayDeque<>();

        // State 1
        originator.setState("1st Memento state");
        snapshot = originator.save();
        history.push(snapshot);

        // State 2
        originator.setState("2nd Memento state");
        snapshot = originator.save();
        history.push(snapshot);

        // State 3
        originator.setState("3rd Memento state");
        System.out.println(originator);

        // Undo
        originator.restore(history.pop());
        System.out.println(originator);

        // Undo
        originator.restore(history.pop());
        System.out.println(originator);
    }
}
