package com.test;

// Класс для работы с внешним сервисом
class ExternalService<T extends RequestValidator, U extends ResponseValidator> {
    private T requestValidator;
    private U responseValidator;

    public ExternalService(T requestValidator, U responseValidator) {
        this.requestValidator = requestValidator;
        this.responseValidator = responseValidator;
    }

    public boolean processRequest(String request) {
        if (!requestValidator.validateRequest(request)) {
            System.out.println("Invalid request");
            return false;
        }

        // Логика взаимодействия с внешним сервисом

        String response = "Some response from external service";

        if (!responseValidator.validateResponse(response)) {
            System.out.println("Invalid response");
            return false;
        }

        return true;
    }
}
