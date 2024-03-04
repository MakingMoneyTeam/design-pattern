
package org.designpattern.creational.singleton;

public class SingletonPatternWithMultiThread {
    private static SingletonPatternWithMultiThread instance;
    public String value;

    private SingletonPatternWithMultiThread(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    public static SingletonPatternWithMultiThread getInstance(String value) {
        if (instance == null) {
            instance = new SingletonPatternWithMultiThread(value);
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("Multi thread with Singleton Pattern: \n");
        Thread threadFoo = new Thread(new SingletonPatternWithSingleThread.ThreadFoo());
        Thread threadBar = new Thread(new SingletonPatternWithSingleThread.ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            SingletonPatternWithSingleThread singleton = SingletonPatternWithSingleThread.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonPatternWithSingleThread singleton = SingletonPatternWithSingleThread.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
