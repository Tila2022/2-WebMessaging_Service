package Sales;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class SalesJPATest {
    SalesJPA salesJPA;
    @Test
    public void ExceptionTest() {
        Assertions.assertDoesNotThrow(() -> salesJPA);
        // Тест на исключение
    }
    @Test
    public void TimeTest() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> "result");
        // Тест времени
    }
}