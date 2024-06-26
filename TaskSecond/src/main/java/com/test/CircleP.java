package com.test;


public class CircleP extends Figure implements Drawable{
    private double radius;

    public CircleP(Point point) {
        super(point);
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован черный круг с центром: x = " + this.point.getX() + ", y = " + this.point.getY());
    }

    @Override
    public void draw(Colour color) {
        System.out.println("Нарисован "+ color.getTitle() + " круг с центром: x = " + this.point.getX() + ", y = " + this.point.getY());
    }
}
