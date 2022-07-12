package com.esielkar.iterator;

public interface IterableCollection<E> {
    public Iterator<E> createIterator();
}
