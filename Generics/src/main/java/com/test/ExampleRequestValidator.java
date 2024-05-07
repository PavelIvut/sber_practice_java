package com.test;

// Пример валидатора запроса
class ExampleRequestValidator implements RequestValidator {
    @Override
    public boolean validateRequest(String request) {
        // Логика валидации запроса
        return true;
    }
}
