package org.designpattern.structural.adapter.example3;

import java.util.Enumeration;
import java.util.Iterator;


/*
* - This is example of Adapter pattern where we are using Adapter to convert
* Enumeration to Iterator
* - If you find the asIterator method in the Enumeration codebase,
* you will see that asIterator method is responsibility for an adapter which is returns a new Iterator object.
*
* */
public class MyClient {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        Enumeration<String> enumeration = new StringEnumeration(names);

        // Use the Enumeration object as if it were an Iterator
        Iterator<String> iterator = enumeration.asIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
