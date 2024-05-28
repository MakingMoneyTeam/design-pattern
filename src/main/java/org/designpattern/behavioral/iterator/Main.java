package org.designpattern.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator<String> iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = iter.next();
            System.out.println("Name : " + name);
        }
    }
}
