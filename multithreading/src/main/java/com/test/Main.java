package com.test;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Задача 1: Создание класса Resource с полем типа int
        Resource resource = new Resource(0);

        // Задача 2: Создание класса ResourceProcessor
        ResourceProcessor resourceProcessor = new ResourceProcessor(resource);

        // Задача 3: Создание класса Increaser
        // Задача 4: Создание 3 экземпляров Increaser и запуск
        Increaser increaser1 = new Increaser(resourceProcessor);
        Increaser increaser2 = new Increaser(resourceProcessor);
        Increaser increaser3 = new Increaser(resourceProcessor);

        increaser1.start();
        increaser2.start();
        increaser3.start();

        // Задача 5: Синхронизация увеличения
        increaser1.join();
        increaser2.join();
        increaser3.join();

        // Задача 6: Создание класса Decreaser
        // Задача 7: Вызов increase и decrease с использованием notify и wait
        Decreaser decreaser = new Decreaser(resourceProcessor);
        Increaser increaser = new Increaser(resourceProcessor);

        Thread decThread = new Thread(decreaser);
        Thread incThread = new Thread(increaser);

        decThread.start();

        synchronized (resourceProcessor) {
            while (resource.getValue() < 5) {
                resourceProcessor.wait();
            }

            for (int i = 0; i < 10; i++) {
                resourceProcessor.increase();
                if (resource.getValue() >= 5) {
                    resourceProcessor.notify();
                    break;
                }
            }

            while (resource.getValue() > 1) {
                resourceProcessor.wait();
            }

            for (int i = 0; i < 10; i++) {
                resourceProcessor.decrease();
                if (resource.getValue() <= 1) {
                    resourceProcessor.notify();
                    break;
                }
            }
        }

        incThread.start();
        incThread.join();
        decThread.join();
    }
}