package com.test;

public class Sq extends Figure implements Drawable{
    private double size;

    public Sq(Point point) {
        super(point);
    }

    @Override
    public double area() {
        return this.size*this.size;
    }

    @Override
    public double perimeter() {
        return this.size*4;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован черный квадрат с центром: x = " + this.point.getX() + ", y = " + this.point.getY());
    }

    @Override
    public void draw(Colour color) {
        System.out.println("Нарисован "+ color.getTitle() + " квадрат с центром: x = " + this.point.getX() + ", y = " + this.point.getY());
    }
}
