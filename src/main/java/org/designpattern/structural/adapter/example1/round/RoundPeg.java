package org.designpattern.structural.adapter.example1.round;

public class RoundPeg {
    private final double radius;

    public RoundPeg() {
        this.radius = 0;
    }

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
