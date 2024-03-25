package com.test;

import org.junit.Test;

public class ClassDTest {

    @Test(expected = RuntimeException.class)
    public void testMethodD() {
        ClassD classD = new ClassD();

        classD.methodD();
    }
}
