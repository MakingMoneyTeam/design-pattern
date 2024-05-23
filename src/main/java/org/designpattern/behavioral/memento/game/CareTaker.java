package org.designpattern.behavioral.memento.game;

public class CareTaker {
    private Memento memento;

    public void LevelMaker(Player player) {
        memento = player.CreateMarker(player);
    }

    public void RestoreState(Player player) {
        player.Restore(memento);
    }
}
