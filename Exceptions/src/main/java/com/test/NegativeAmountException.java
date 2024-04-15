package com.test;

public class NegativeAmountException extends BankOnlineException {
    public NegativeAmountException(String message) {
        super(message);
    }
}
