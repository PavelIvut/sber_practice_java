package com.test;

public class PizzaOrder {

    private String name;
    private Size size;
    private boolean sauce;
    private String address;
    private boolean orderAccepted;

    public PizzaOrder(String name, Size size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
    }

    public void order() {
        if (orderAccepted) {
            System.out.println("Заказ уже принят.");
        } else {
            orderAccepted = true;
            System.out.println("Заказ принят.");
            System.out.println("Пицца: " + name);
            System.out.println("Размер: " + size);
            System.out.println("Соус: " + (sauce ? "да" : "нет"));
            System.out.println("Адрес доставки: " + address);
        }
    }

    public void cancel() {
        if (orderAccepted) {
            orderAccepted = false;
            System.out.println("Заказ отменен.");
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOrderAccepted() {
        return orderAccepted;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", size: " + this.size + ", sauce: " + this.sauce + ", address: " +
                this.address + ", orderAccepted: " + this.orderAccepted +
                '}';
    }

    public enum Size {
        SMALL,
        MEDIUM,
        BIG
    }


}
