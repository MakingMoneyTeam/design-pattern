package org.designpattern.structural.adapter.example1.adapter;

import org.designpattern.structural.adapter.example1.round.RoundPeg;
import org.designpattern.structural.adapter.example1.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
