package controllers.servlet;

import controllers.model.Customer;
import controllers.service.CustomerService;
import controllers.service.CustomerServiceFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerServlet {
    private List<Customer> customers;
    private CustomerService customerService = CustomerServiceFactory.getInstance();
    @GetMapping("/customers")

    public String getFormList(
            Model model


    ){
        customers = customerService.findAll();
        model.addAttribute("customers",customers );
        return "list";
    }
    @GetMapping("/customers?action=info&")
    public String infoForm(
            @RequestParam Long id, Model model
    )
    {
       Customer customer= customerService.findOne(id);
       model.addAttribute("name",customer.getName());
       model.addAttribute("email",customer.getEmail());
       model.addAttribute("address",customer.getAddress());
       return "info";

    }
//    private CustomerService customerService = CustomerServiceFactory.getInstance();
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        Customer customer = new Customer();
//        customer.setName(req.getParameter("name"));
//        customer.setEmail(req.getParameter("email"));
//        customer.setAddress(req.getParameter("address"));
//
//        Long id = Long.valueOf(req.getParameter("id"));
//        customer.setId(id);
//        customerService.save(customer);
//
//        resp.sendRedirect("/customers/list.jsp");
//    }
}
