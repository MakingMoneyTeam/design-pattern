package org.designpattern.structural.adapter.adapter;

import org.designpattern.structural.adapter.round.RoundPeg;
import org.designpattern.structural.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth());
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
