package com.test;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCountEvenNumbers {

    @Test
    public void testCountEvenNumbers() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int result = CountEvenNumbers.countEvenNumbers(numbers);
        assertEquals(5, result);
    }
}
