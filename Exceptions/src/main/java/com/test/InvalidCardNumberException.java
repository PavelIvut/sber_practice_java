package com.test;

public class InvalidCardNumberException extends BankOnlineException {
    public InvalidCardNumberException(String message) {
        super(message);
    }
}
