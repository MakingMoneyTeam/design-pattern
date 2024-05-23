package org.designpattern.behavioral.memento.game;

public class Memento {
    public int level;
    public int score;
    public String health;

    public Memento(int level, int score, String health)
    {
        this.level = level;
        this.score = score;
        this.health = health;
    }
}
