package Repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class SalesJDBCRepositoryTest {
    SalesJDBCRepository salesJDBCRepository;
    @Test
    public void ExceptionTest() {
        Assertions.assertDoesNotThrow(() -> salesJDBCRepository);
        // Тест на исключение
    }

    @Test
    public void TimeTest() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> "result");
        // Тест времени
    }
}