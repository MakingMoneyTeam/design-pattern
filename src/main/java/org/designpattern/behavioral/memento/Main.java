package org.designpattern.behavioral.memento;

import org.designpattern.behavioral.memento.game.CareTaker;
import org.designpattern.behavioral.memento.game.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        CareTaker careTaker = new CareTaker();

        player.level = 1;
        player.score = 100;
        player.health = "Good";
        player.DisplayInfo();

        // Save state
        careTaker.LevelMaker(player);

        player.level = 2;
        player.score = 200;
        player.health = "Better";
        player.DisplayInfo();

        // Restore to previous state
        careTaker.RestoreState(player);

        player.DisplayInfo();
    }
}
