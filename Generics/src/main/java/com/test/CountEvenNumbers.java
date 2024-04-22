package com.test;

import java.util.Collection;

public class CountEvenNumbers {

    public static <T extends Number> int countEvenNumbers(Collection<T> collection) {
        int count = 0;
        for (T element : collection) {
            if (element.intValue() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
