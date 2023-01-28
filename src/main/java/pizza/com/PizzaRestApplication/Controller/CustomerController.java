package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizza.com.PizzaRestApplication.DTO.CustomerDTO;
import pizza.com.PizzaRestApplication.Entity.Customer;
import pizza.com.PizzaRestApplication.Repository.CustomerRepository;
import pizza.com.PizzaRestApplication.Utility.ValueMapper;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository repository;

    @GetMapping("/all")
    List<CustomerDTO> all() {
        List<Customer> customers= repository.findAll();
        return customers.stream().map(ValueMapper::mapCustomerToCustomerDTO).collect(Collectors.toList());
    }


}
