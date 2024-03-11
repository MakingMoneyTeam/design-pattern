package org.designpattern.structural.adapter.example3;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public class StringEnumeration implements Enumeration<String> {
    private String[] elements;
    private int index = 0;

    public StringEnumeration(String[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasMoreElements() {
        return index < elements.length;
    }

    @Override
    public String nextElement() {
        if (hasMoreElements()) {
            return elements[index++];
        } else {
            throw new NoSuchElementException();
        }

    }
}
