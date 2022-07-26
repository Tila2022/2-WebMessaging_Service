package com.example.web_application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@SpringBootTest
class WebApplicationTests {
    WebApplication webApplication;
    @Test
    public void ExceptionTest() {
        Assertions.assertDoesNotThrow(() -> webApplication);
        // Тест на исключение
    }

    @Test
    public void TimeTest() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> "result");
        // Тест времени
    }
}