package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizza.com.PizzaRestApplication.Entity.Customers;
import pizza.com.PizzaRestApplication.Repository.CustomerRepository;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository repository;

    @GetMapping("/all")
    List<Customers> all() {
        return repository.findAll();
    }


}
