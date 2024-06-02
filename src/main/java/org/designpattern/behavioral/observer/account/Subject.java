package org.designpattern.behavioral.observer.account;

public interface Subject {
    void attach (Observer observer);
    void detach (Observer observer);
    void notifyAllObservers();
}
