package com.test;
public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String Name) {
        System.out.println("Звонит " + Name);
    }

    public void receiveCall(String Name, String Number) {
        System.out.printf("Звонит: ", Name, Number);
    }

    @Override
    public String toString() {
        return ("Номер: " + this.number + "Модель: " + this.model + "Вес: " + this.weight);
    }

    public void sendMessage(String[] numbers) {
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}

