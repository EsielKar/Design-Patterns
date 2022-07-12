package com.esielkar.iterator;

public class ConcreteIterator<E> implements Iterator<E> {
    private ConcreteCollection<E> collection;
    // State
    private int currentPosition;

    public ConcreteIterator(ConcreteCollection<E> collection) {
        this.collection = collection;
    }

    @Override
    public E getNext() {
        return hasMore() ? collection.get(currentPosition++) : null;
    }

    @Override
    public boolean hasMore() {
        return currentPosition < collection.size();
    }

}
