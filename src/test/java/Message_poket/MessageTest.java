package Message_poket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class MessageTest {
    Message message;
    @Test
    public void ExceptionTest() {
        Assertions.assertDoesNotThrow(() -> message);
        // Тест на исключение
    }

    @Test
    public void TimeTest() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> "result");
        // Тест времени
    }
}