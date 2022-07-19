import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RunJPA {
    // Вызов методов из интерфейса salesJPARepository
    @Autowired
    private SalesJPARepository salesJPARepository;

    public void findAll() {
        salesJPARepository.findAll("price");
        salesJPARepository.findAll("price");
        salesJPARepository.findAll("dataFrom");
        salesJPARepository.findAll("dataTo");
    }

    public List<SalesJPA> findByPriceGreaterThan() {
        return salesJPARepository.findByPriceGreaterThan(100);
    }
}