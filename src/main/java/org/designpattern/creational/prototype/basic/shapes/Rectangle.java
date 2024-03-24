package org.designpattern.creational.prototype.basic.shapes;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle shape2)|| !super.equals(object2)) return false;
        return shape2.point.equals(point) && shape2.color.equals(color) && shape2.width == width && shape2.height == height;
    }

}
