package com.test;

import java.lang.annotation.Repeatable;

@Repeatable(RepeatableClasses.class)
@interface RepeatableClass {
    int hour();
    int priority();
    String description();
}

@interface RepeatableClasses {
    RepeatableClass[] value();
}
