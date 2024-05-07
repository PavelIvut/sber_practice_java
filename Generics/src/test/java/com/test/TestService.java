package com.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestService {

    @Test
    public void testProcessValidRequestAndResponse() {
        // Создаем экземпляр валидатора запроса и ответа
        ExampleRequestValidator requestValidator = new ExampleRequestValidator();
        ExampleResponseValidator responseValidator = new ExampleResponseValidator();

        // Создаем экземпляр внешнего сервиса
        ExternalService<ExampleRequestValidator, ExampleResponseValidator> externalService = new ExternalService<>(requestValidator, responseValidator);

        // Создаем валидный запрос
        String validRequest = "Valid request data";

        // Проверяем, что метод processRequest возвращает true для валидного запроса и ответа
        assertTrue(externalService.processRequest(validRequest));
    }

    @Test
    public void testProcessInvalidRequest() {
        // Создаем экземпляр валидатора запроса и ответа
        RequestValidator requestValidator = new ExampleRequestValidator();
        ResponseValidator responseValidator = new ExampleResponseValidator();

        // Создаем экземпляр внешнего сервиса
        ExternalService<RequestValidator, ResponseValidator> externalService = new ExternalService<>(requestValidator, responseValidator);

        // Создаем невалидный запрос
        String invalidRequest = "Invalid request data";

        // Проверяем, что метод processRequest возвращает false для невалидного запроса
        assertFalse(externalService.processRequest(invalidRequest));
    }

    @Test
    public void testProcessInvalidResponse() {
        // Создаем экземпляр валидатора запроса и ответа
        ExampleRequestValidator requestValidator = new ExampleRequestValidator();
        // Создаем валидатор ответа, который всегда возвращает false
        ExampleResponseValidator responseValidator = new ExampleResponseValidator() {
            @Override
            public boolean validateResponse(String response) {
                return false;
            }
        };

        // Создаем экземпляр внешнего сервиса
        ExternalService<ExampleRequestValidator, ExampleResponseValidator> externalService = new ExternalService<>(requestValidator, responseValidator);

        // Создаем валидный запрос
        String validRequest = "Valid request data";

        // Проверяем, что метод processRequest возвращает false для валидного запроса, но невалидного ответа
        assertFalse(externalService.processRequest(validRequest));
    }
}

