package com.test;

import java.util.stream.Stream;

public class Bool2Stream {
    public static void main(String[] args) {
        String binaryString = "1001010110";

        Boolean booleanStream = binaryString.chars()
                .mapToObj(ch -> ch == '1')
                .reduce(Boolean::logicalAnd)
                .orElse(false);

        System.out.println("Result: " + booleanStream);
    }
}
