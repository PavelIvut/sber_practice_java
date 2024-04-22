package com.test;

public enum Colour {
    BLUE("синий"),
    RED("красный"),
    YELLOW("желтый"),
    GREEN("зеленый"),
    WHITE("белый"),
    BLACK("черный");

    private String title;

    public String getTitle(){
        return this.title;
    }
    Colour(String title) {
        this.title = title;
    }
}
