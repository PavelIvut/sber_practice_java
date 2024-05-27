package com.test;

import lombok.NonNull;

@Inheritance(dayOfWeek = 5)
public class FirstChildClass extends Parent {
    @RepeatableAnnotation(hour = 1, priority = 3, description = "One")
    public static DataContainer processOne(@NonNull DataContainer input) {
        int result = input.getValue() * 2;
        String message = input.getName() + "Hi!";
        boolean flag = true;

        return new DataContainer(result, message, flag);
    }

    @RepeatableAnnotation(hour = 3, priority = 0, description = "Two")
    public static DataContainer processTwo(@NonNull DataContainer input) {
        int result = input.getValue() * 4;
        String message = input.getName() + "Упси дупси!";
        boolean flag = false;

        return new DataContainer(result, message, flag);
    }
}
