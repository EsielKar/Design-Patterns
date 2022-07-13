package com.esielkar.iterator;

public class ConcreteCollection<E> implements IterableCollection<E> {
    private E[] array;

    public ConcreteCollection(E[] array) {
        this.array = array;
    }

    @Override
    public Iterator<E> createIterator() {
        return new ConcreteIterator<E>(this);
    }

    public int size() {
        return array != null ? array.length : 0;
    }

    public E get(int at) {
        return array[at];
    }

}
