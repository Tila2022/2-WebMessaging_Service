import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.Writer;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class SalesJPAController {
    @Autowired
    SalesJPARepository salesJPARepository;

    @GetMapping("/sales")
    public String getSalesPage(Model model) {
        List<Writer> sales = salesJPARepository.findAll();
        model.addAttribute("sales", sales);
        return "sales";
    }

    @PostMapping("/sales")
    public String addSalesPage(long id, long price, Date dataFrom, Date dataTo, Map<String, Object> model) {
        SalesJPA sales = (SalesJPA) salesJPARepository.findAll();
        model.put("sales", sales);
        return "sales";
    }
}