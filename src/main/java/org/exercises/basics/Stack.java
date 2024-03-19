package org.exercises.basics;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    public void push(T item) {
        items.add(item);
    }

    public T pop() throws Exception {
        if (items.isEmpty())
            throw new Exception("No more items on the Stack");

        var lastItem = items.getLast();
        items.removeLast();
        return lastItem;
    }
}
