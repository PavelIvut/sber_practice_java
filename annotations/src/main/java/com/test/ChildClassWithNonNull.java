package com.test;

import lombok.NonNull;

public class ChildClassWithNonNull {
    public void methodWithNonNull(@NonNull DataContainer data) {
        System.out.println(data);
    }
}
