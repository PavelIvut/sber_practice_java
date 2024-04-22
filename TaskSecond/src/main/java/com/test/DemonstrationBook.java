package com.test;

public class DemonstrationBook {
    public static void main(String[] args) {
            Author author = new Author("Сергей Свердлов", "Male", "sergeys@example.com");
            Book book = new Book("Java Programming", author, 2022);
            System.out.println(author);
            System.out.println(book);
        }
}
