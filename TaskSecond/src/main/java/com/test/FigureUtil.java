package com.test;

public class FigureUtil {
    private FigureUtil(){}

    public static double area(Figure figure){
        return figure.area();
    }
    public static double perimeter(Figure figure){
        return figure.perimeter();
    }
    public static void draw(Drawable figure){
        figure.draw();
    }
    public static void draw(Drawable figure, Colour color){
        figure.draw(color);
    }
}
