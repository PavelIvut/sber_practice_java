package com.test;

public class Demonstration_Phone {
        public static void main(String[] args) {
            Phone phone1 = new Phone("89115432324", "iPhone X", 0.5);
            Phone phone2 = new Phone("89115027675", "Samsung Galaxy S10");
            phone1.receiveCall("Санёк");
            phone2.receiveCall("Лёня", "89876543219");
            System.out.println(phone1);
            System.out.println(phone2);
            String[] phoneNumbers = {"111222333", "444555666", "777888999"};
            phone1.sendMessage(phoneNumbers);
        }
}
