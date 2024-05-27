package com.test;

import lombok.NonNull;

public class SecondChildClass extends Parent {
    @RepeatableAnnotation(hour = 10, priority = 10, description = "process")
    public static DataContainer process(@NonNull DataContainer input) {
        int result = input.getValue() * 10;
        String message = input.getName() + "How are youuu!";
        boolean flag = true;

        return new DataContainer(result, message, flag);
    }
}
