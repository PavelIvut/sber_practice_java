package com.test;
public class TaskFirst {
    public static void method1() {
        System.out.println("Задание 1");
        for (int number = 7; number <= 98; number += 7) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    /*///////////////////////////////////////////////////////////////////////////////////////////////*/

    public static void method2() {
        System.out.println();
        System.out.println("Задание 2");
        int size = 10; // размер массива
        int[] array = new int[size]; // создаем массив

        // Заполняем массив случайными числами
        for (int number = 0; number < size; number++) {
            array[number] = (int) (Math.random() * 100); // генерируем случайное число от 0 до 100
        }

        // Находим максимальное значение в массиве
        int max = array[0];
        for (int number = 1; number < size; number++) {
            if (array[number] > max) {
                max = array[number];
            }
        }

        // Находим среднее значение в массиве
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        double average = (double) sum / size;

        System.out.println("Массив случайных чисел:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println("\nМаксимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }

    /*///////////////////////////////////////////////////////////////////////////////////////////////*/

    public static void method3() {
        System.out.println();
        System.out.println("Задание 3");
        // Перебираем числа от 2 до 100
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

        // Проверяем делится ли число нацело на числа от 2 до корня из number
            for (int digit = 2; digit <= Math.sqrt(number); digit++) {
                if (number % digit == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Если число простое, выводим его на консоль
            if (isPrime) {
                System.out.println(number);
            }
        }
    }

    /*///////////////////////////////////////////////////////////////////////////////////////////////*/

    public static void method4() {
        System.out.println();
        System.out.println("Задание 4");
        int rows = 3;
        int cols = 5;

        for (int number = 0; number < rows; number++) {
            for (int digit = 0; digit < cols; digit++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }
}
