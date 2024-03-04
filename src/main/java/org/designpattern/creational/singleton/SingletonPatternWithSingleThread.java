package org.designpattern.creational.singleton;
public class SingletonPatternWithSingleThread {
    private static SingletonPatternWithSingleThread instance;
    public String value;

    private SingletonPatternWithSingleThread(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonPatternWithSingleThread getInstance(String value) {
        if (instance == null) {
            instance = new SingletonPatternWithSingleThread(value);
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("Single thread with Singleton Pattern: \n");
        SingletonPatternWithSingleThread singleton = SingletonPatternWithSingleThread.getInstance("FOO");
        SingletonPatternWithSingleThread anotherSingleton = SingletonPatternWithSingleThread.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
        System.out.println("Multi thread with Singleton Pattern: \n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
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
