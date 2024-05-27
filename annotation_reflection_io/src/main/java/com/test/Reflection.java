package com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import lombok.NonNull;
import static java.nio.file.Files.newDirectoryStream;

public class Reflection {
    private static final String LOG_DIR = "log";
    private static final String ROOT_PATH = "C:\\JAVALEARNING\\sber-practice-java\\Annots-Reflection-IO\\src\\main\\java\\com\\test";
    private static final List<Class<?>> CLASSES = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        init();
    }

    private static void init() throws ClassNotFoundException, IOException {
        CLASSES.add(FirstChildClass.class);
        CLASSES.add(SecondChildClass.class);
        CLASSES.add(ThirdChildClass.class);

        Path logDir = Path.of(ROOT_PATH, LOG_DIR);
        if (!Files.exists(logDir)) {
            Files.createDirectory(logDir);
        }

        for (Class<?> clazz : CLASSES) {
            int dayOfWeek = clazz.getAnnotation(Inheritance.class).dayOfWeek();
            processInstance(dayOfWeek);
        }
    }

    private static void processInstance(int dayOfWeek) throws IOException {
        DataContainer dataContainer = createDataContainer(dayOfWeek);
        executeMethods(dataContainer);
    }

    private static DataContainer createDataContainer(int dayOfWeek) {
        int value = 1;
        String message = "Hey!";
        boolean isImportant = true;
        if (dayOfWeek == 1) {
            return new DataContainer(value * dayOfWeek, message, isImportant);
        } else if (dayOfWeek == 2) {
            return new DataContainer(value * dayOfWeek, message + message, !isImportant);
        } else {
            return new DataContainer(value * dayOfWeek, message, !(isImportant && dayOfWeek > 4));
        }
    }

    private static void executeMethods(DataContainer dataContainer) throws IOException {
        List<Method> methods = getSortedMethods();

        refreshLogDirectory();

        String fileName = LocalDateTime.now().toString().replace(":", "-") + ".txt";
        Path logFile = Path.of(ROOT_PATH, LOG_DIR, fileName);
        Files.createFile(logFile);

        for (Method method : methods) {
            Field[] initialFields = dataContainer.getClass().getDeclaredFields();
            try {
                dataContainer = (DataContainer) method.invoke(null, dataContainer);
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println(e);
            }
            Field[] finalFields = dataContainer.getClass().getDeclaredFields();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile.toString(), true))) {
                writer.write("Method done. Changes: " + !Arrays.equals(finalFields, initialFields) + "\n");
            } catch (IOException e) {
                System.out.println("Error!");
            }
        }
    }

    private static List<Method> getSortedMethods() {
        List<Method> methods = new ArrayList<>();
        for (Class<?> clazz : CLASSES) {
            methods.addAll(Arrays.asList(clazz.getDeclaredMethods()));
        }
        methods.sort(Comparator.comparingInt(method -> method.getAnnotation(RepeatableAnnotation.class).priority()));
        return methods;
    }

    private static void refreshLogDirectory() throws IOException {
        Path logDir = Path.of(ROOT_PATH, LOG_DIR);
        try (DirectoryStream<Path> files = newDirectoryStream(logDir)) {
            int fileCount = 0;
            for (Path file : files) {
                fileCount++;
            }
            if (fileCount > 2) {
                try (DirectoryStream<Path> filesToDelete = newDirectoryStream(logDir)) {
                    for (Path file : filesToDelete) {
                        Files.delete(file);
                    }
                }
            }
        }
    }
}