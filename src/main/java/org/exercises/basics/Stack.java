package org.exercises.basics;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private final List<Object> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public List<Object> getItems() {
        return items;
    }

    public void push(Object item) {
        items.add(item);
    }

    public Object pop() throws Exception {
        if (items.isEmpty())
            throw new Exception("No more items on the Stack");

        var lastItem = items.getLast();
        items.removeLast();
        return lastItem;
    }
}
