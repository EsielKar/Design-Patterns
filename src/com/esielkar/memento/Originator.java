package com.esielkar.memento;

public class Originator {
    private Object state;

    public void setState(Object state) {
        this.state = state;
    }

    public Memento save() {
        return new Memento(state);
    }

    public void restore(Memento memento) {
        this.state = memento.state;
    }

    @Override
    public String toString() {
        return "Current state: " + state;
    }

    public class Memento {
        private Object state;

        public Memento(Object state) {
            this.state = state;
        }

        public Object getState() {
            return state;
        }

    }
}