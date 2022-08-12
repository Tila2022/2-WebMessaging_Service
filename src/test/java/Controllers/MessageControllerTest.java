package Controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class MessageControllerTest {
    MessageController messageController;
    @Test
    public void ExceptionTest() {
        Assertions.assertDoesNotThrow(() -> messageController);
        // Тест на исключение
    }

    @Test
    public void TimeTest() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> "result");
        // Тест времени
    }
}