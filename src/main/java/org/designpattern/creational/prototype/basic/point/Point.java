package org.designpattern.creational.prototype.basic.point;

import org.designpattern.creational.prototype.basic.Prototype;

public class Point implements Prototype<Point> {
    public int x;
    public int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Point clone() {
        return new Point(x, y);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Point point2)) return false;
        return point2.x == x && point2.y == y;
    }
}
