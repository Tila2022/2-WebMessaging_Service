package Run;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class RunJDBCTest {
    RunJDBC runJDBC;
    @Test
    public void ExceptionTest() {
        Assertions.assertDoesNotThrow(() -> runJDBC);
        // Тест на исключение
    }

    @Test
    public void TimeTest() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> "result");
        // Тест времени
    }
}