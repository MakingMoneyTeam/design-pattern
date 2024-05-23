package org.designpattern.behavioral.memento.game;

public class Player {
    public int level;
    public int score;
    public String health;
    public int lifeline = 3;

    public Memento CreateMarker(Player player) {
        return new Memento(player.level, player.score, player.health);
    }

    public void Restore(Memento memento) {
        this.level = memento.level;
        this.score = memento.score;
        this.health = memento.health;
        this.lifeline -= 1;
    }

    public void DisplayInfo() {
        System.out.println("Level: " + level);
        System.out.println("Score: " + score);
        System.out.println("Health: " + health);
        System.out.println("Lifeline: " + lifeline);
    }
}
