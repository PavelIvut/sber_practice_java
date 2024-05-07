package com.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sounding> sounds = new ArrayList<>();
        sounds.add(new Cat());
        sounds.add(new Dog());

        // Task 4
        sounds.add(new Sounding() {
            @Override
            public void sound() {
                System.out.println("Tweat");
            }
        });

        // Task 5
        sounds.add(() -> System.out.println("Moo"));

        // Task 6
        sounds.add(new AnimalSound()::makeLionSound);

        // Task 7
        sounds.forEach(Sounding::sound);
    }
}