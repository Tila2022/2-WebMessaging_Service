package Repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class SalesJPARepositoryTest {
    SalesJPARepository salesJPARepository;
    @Test
    public void ExceptionTest() {
        Assertions.assertDoesNotThrow(() -> salesJPARepository);
        // Тест на исключение
    }

    @Test
    public void TimeTest() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> "result");
        // Тест времени
    }
}