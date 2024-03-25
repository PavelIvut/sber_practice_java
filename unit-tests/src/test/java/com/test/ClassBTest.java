package com.test;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class ClassBTest {

    @Test
    public void testMethodB() {
        ClassA classA = mock(ClassA.class);
        ClassB classB = new ClassB();

        classB.methodB(classA);

        verify(classA, times(1)).methodA();
    }
}