import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
class SalesJDBCRepository {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public SalesJDBCRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //SalesJDBCTemplate
    public int count() {
        return jdbcTemplate.queryForObject("select count(*)from public.sales", Integer.class);
    }
    public List<SalesJDBC> getSalesJDBC() {
        return jdbcTemplate.query("select*public.sales_jdbc", (rs, rowNum) ->
                new SalesJDBC (
                        rs.getLong("id"),
                        rs.getLong("price"),
                        rs.getDate("dataFrom"),
                        rs.getDate("dataTo")));
    }
}