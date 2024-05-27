package com.test;

import lombok.NonNull;

@Inheritance(dayOfWeek = 2)
public class ThirdChildClass extends Parent {
    @RepeatableAnnotation(hour = 2, priority = 6, description = "processOne")
    public static DataContainer processOne(@NonNull DataContainer input) {
        int result = input.getValue() * 999;
        String message = input.getName() + " Барселона снова вторая! Hala Madrid! Араухо - пёс Винисиуса!";
        boolean flag = !true;

        return new DataContainer(result, message, flag);
    }

    @RepeatableAnnotation(hour = 0, priority = 100, description = "processTwo")
    public static DataContainer processTwo(@NonNull DataContainer input) {
        int result = input.getValue() * 0;
        String message = input.getName() + "!";
        boolean flag = false;

        return new DataContainer(result, message, flag);
    }
}