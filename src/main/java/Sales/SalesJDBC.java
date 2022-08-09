package Sales;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

// Создание аннотаций lombok и таблицы с полями
public class SalesJDBC {
    @Getter
    @Setter
    private long id;
    private long price;
    private Date dataFrom;
    private Date dataTo;

    public SalesJDBC(long id, long price, java.sql.Date dataFrom, java.sql.Date dataTo) {
    }
}