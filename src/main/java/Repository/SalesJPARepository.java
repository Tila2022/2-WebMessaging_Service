package Repository;

import Sales.SalesJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Writer;
import java.util.List;

// Интерфейс для вызываемых методов
@Repository
public interface SalesJPARepository extends JpaRepository<Writer, Integer> {
    // Метод вывода полной информации о продаже по указанному идентификатору
    void findAll(String columnsName);

    // Метод возвращает записи сумма чека которых превышает 100
    List<SalesJPA> findByPriceGreaterThan(int number);
}