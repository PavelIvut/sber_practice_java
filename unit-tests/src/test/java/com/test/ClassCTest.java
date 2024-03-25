package com.test;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ClassCTest {

    @Test
    public void testMethodC() {
        ClassA classA = mock(ClassA.class);
        ClassC classC = new ClassC();

        classC.methodC(classA);

        verify(classA, times(2)).methodA();
    }
}
