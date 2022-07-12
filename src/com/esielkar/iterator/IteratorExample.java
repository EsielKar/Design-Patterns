package com.esielkar.iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ConcreteCollection<Integer> collection = new ConcreteCollection<Integer>(
                new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        Iterator iterator = collection.createIterator();
        while (iterator.hasMore()) {
            System.out.println(iterator.getNext());
        }
    }
}
