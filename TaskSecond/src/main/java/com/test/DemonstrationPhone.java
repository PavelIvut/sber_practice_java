package com.test;

public class DemonstrationPhone {
    public static final String number1 = "89115432326";
    public static final String number2 = "89115027675";
    public static final String number3 = "89115432326";
    public static final String model1 = "iPhone X";
    public static final String model2 = "Samsung Galaxy S10";
    public static final String name1 = "Санёк";
    public static final String name2 = "Лёня";
    public static final String phoneNumber1 = "111222333";
    public static final String phoneNumber2 = "444555666";
    public static final String phoneNumber3 = "777888999";

        public static void main(String[] args) {

            Phone phone1 = new Phone(number1, model1, 0.5);
            Phone phone2 = new Phone(number2, model2);
            phone1.receiveCall(name1);
            phone2.receiveCall(name2, number3);
            System.out.println(phone1);
            System.out.println(phone2);
            String[] phoneNumbers = {phoneNumber1, phoneNumber2, phoneNumber3};
            phone1.sendMessage(phoneNumbers);
        }
}
