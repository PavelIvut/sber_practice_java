package com.test;

public class BlockedCardException extends BankOnlineException {
    public BlockedCardException(String message) {
        super(message);
    }
}
