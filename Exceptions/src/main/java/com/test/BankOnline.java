package com.test;

public class BankOnline {
    private static final String[] blockedCards = {
            "1111111111111111",
            "2222222222222222",
            "3333333333333333"
    };

    public void send(String cardNumber, Double money) throws BankOnlineException {
        if (cardNumber == null || money == null) {
            throw new BankOnlineException("Аргументы не могут быть null!");
        }

        if (!cardNumber.matches("\\d{16}")) {
            throw new InvalidCardNumberException("Номер карты должен состоять из 16 цифр!");
        }

        if (money < 0) {
            throw new NegativeAmountException("Сумма перевода не может быть отрицательной!");
        }

        if (money > 50000) {
            throw new LimitExceededException("Лимит до 50 000!");
        }

        for (String blockedCard : blockedCards) {
            if (blockedCard.equals(cardNumber)) {
                throw new BlockedCardException("Перевод на заблокированные карты невозможен!");
            }
        }
    }
}
