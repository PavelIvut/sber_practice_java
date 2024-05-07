package com.test;

public class LimitExceededException extends BankOnlineException {
    public LimitExceededException(String message) {
        super(message);
    }
}
