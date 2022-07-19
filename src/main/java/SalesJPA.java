import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

// Создание аннотаций lombok и таблицы с полями
@Entity
@Table(name = "sales_jpa")
@NoArgsConstructor
@Getter
@Setter
public class SalesJPA {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sales_jpa_id_seq")
    @SequenceGenerator(name = "dataTo", sequenceName = "sales_jpa_id_seq", allocationSize = 1)
    private long id;

    @Column(name = "price")
    private long price;

    @Column(name = "dataFrom")
    private Date dataFrom;

    @Column(name = "dataTo")
    private Date dataTo;
}