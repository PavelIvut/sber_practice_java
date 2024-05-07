package com.test;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3");

        Map<Long, String> map = stringStream
                .map(s -> new StreamContainer(s, new Random().nextLong())) // преобразуем Stream в StreamContainer с рандомным count
                .peek(System.out::println)
                .collect(Collectors.toMap(StreamContainer::getCount, StreamContainer::getName)); // преобразуем в Map

        System.out.println(map);
    }
}
