package org.designpattern.creational.singleton;

public class ThreadSafeSingletonWithLazyLoading {
    // The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile ThreadSafeSingletonWithLazyLoading instance;

    public String value;

    private ThreadSafeSingletonWithLazyLoading(String value) {
        this.value = value;
    }

    public static ThreadSafeSingletonWithLazyLoading getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        ThreadSafeSingletonWithLazyLoading result = instance;
        if (result != null) {
            return result;
        }
        synchronized(ThreadSafeSingletonWithLazyLoading.class) {
            if (instance == null) {
                instance = new ThreadSafeSingletonWithLazyLoading(value);
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingletonWithLazyLoading singleton = ThreadSafeSingletonWithLazyLoading.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingletonWithLazyLoading singleton = ThreadSafeSingletonWithLazyLoading.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
