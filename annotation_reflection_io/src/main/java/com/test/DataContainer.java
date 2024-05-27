package com.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataContainer {
    private int value;
    private String name;
    private boolean isActive;

    public DataContainer(int i, String message, boolean b) {
    }
}
