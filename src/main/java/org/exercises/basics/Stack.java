package org.exercises.basics;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private final List<Object> items = new ArrayList<>();

    public void push(Object item) {
        items.add(item);
    }

    public Object pop() {
        if (items.isEmpty())
            throw new IllegalStateException("Stack is empty.");

        var lastItemIndex = items.size() - 1;
        var lastItem = items.get(lastItemIndex);
        items.remove(lastItemIndex);

        return lastItem;
    }
}
