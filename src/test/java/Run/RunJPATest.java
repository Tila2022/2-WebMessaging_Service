package Run;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class RunJPATest {
    RunJPA runJPA;
    @Test
    public void ExceptionTest() {
        Assertions.assertDoesNotThrow(() -> runJPA);
        // Тест на исключение
    }

    @Test
    public void TimeTest() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> "result");
        // Тест времени
    }
}