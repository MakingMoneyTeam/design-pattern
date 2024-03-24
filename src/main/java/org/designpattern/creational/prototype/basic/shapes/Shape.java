package org.designpattern.creational.prototype.basic.shapes;

import org.designpattern.creational.prototype.basic.point.Point;
import org.designpattern.creational.prototype.basic.Prototype;

import java.util.Objects;

public abstract class Shape implements Prototype<Shape> {
    public Point point;
    public String color;

    public Shape() {
        this.point = new Point();
    }

    public Shape(Shape target) {
        if (target != null) {
            this.point = target.point.clone();
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape shape2)) return false;
        return shape2.point.equals(point) && Objects.equals(shape2.color, color);
    }
}
