package com.test;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void testSound() {
        List<Sounding> sounds = new ArrayList<>();
        sounds.add(new Cat());
        sounds.add(new Dog());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Test sound method for each object
        sounds.forEach(Sounding::sound);
    }
}

