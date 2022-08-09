package Run;

import Repository.SalesJDBCRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class RunJDBC {
    SalesJDBCRepository salesJDBCRepository;
    // Метод вывода полной информации о продаже по указанному идентификатору через bean.xml
    public void findAll() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        SalesJDBCRepository jdbc = new SalesJDBCRepository(new JdbcTemplate(ctx.getBean(DataSource.class)));
        jdbc.count();
    }

    public void findByPriceGreaterThan() {
        salesJDBCRepository.getSalesJDBC();
    }
}