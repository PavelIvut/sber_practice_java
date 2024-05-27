package com.test;

public class ChildClassWithMethods extends ChildClass {
    @RepeatableClass(hour = 3, priority = 1, description = "Первый метод")
    public void methodOne(DataContainer data) {
        System.out.println(data);
    }

    @RepeatableClass(hour = 5, priority = 2, description = "Второй метод")
    public void methodTwo(DataContainer data) {
        System.out.println(data);
    }
}
