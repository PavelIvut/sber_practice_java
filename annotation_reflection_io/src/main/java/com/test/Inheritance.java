package com.test;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Inheritance {
    int dayOfWeek();
}
