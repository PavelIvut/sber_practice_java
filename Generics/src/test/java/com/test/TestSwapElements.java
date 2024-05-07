package com.test;
import com.test.SwapElements;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestSwapElements {

    @Test
    public void testSwapElements() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertTrue(SwapElements.swapElements(list, 0, 2));
        assertEquals(3, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(1, list.get(2));

        assertFalse(SwapElements.swapElements(list, 0, 3));
    }
}
