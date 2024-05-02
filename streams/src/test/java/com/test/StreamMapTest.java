package com.test;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StreamMapTest {

    @Test
    void testStreamOperation() {
        Stream<String> stringStream = Stream.of("1", "2", "3");

        Map<Long, String> map = stringStream
                .map(s -> new StreamContainer(s, new Random().nextLong()))
                .collect(Collectors.toMap(StreamContainer::getCount, StreamContainer::getName));

        assertEquals(3, map.size());
    }
}
