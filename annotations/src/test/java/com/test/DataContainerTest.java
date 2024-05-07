package com.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataContainerTest {
    @Test
    void testGettersAndSetters() {
        DataContainer data = new DataContainer();
        data.setNumber(10);
        data.setText("text");
        data.setValue(5.5);

        assertEquals(10, data.getNumber());
        assertEquals("text", data.getText());
        assertEquals(5.5, data.getValue(), 0.001);
    }
}
