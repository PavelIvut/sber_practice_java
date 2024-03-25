package com.test;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class ColculatorTest {
    @Test
    public void testPrivateMethod() throws Exception {
        Colculator colculator = new Colculator();
        Method privateMethod = colculator.getClass().getDeclaredMethod("privateMethod", int.class, int.class);
        privateMethod.setAccessible(true);
        int result = (int) privateMethod.invoke(colculator, 2, 3);
        assertEquals(5, result);
    }
}
