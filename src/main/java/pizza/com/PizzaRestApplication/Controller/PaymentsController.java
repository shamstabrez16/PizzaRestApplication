package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizza.com.PizzaRestApplication.Entity.Payments;
import pizza.com.PizzaRestApplication.Repository.PaymentsRepository;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentsController {
    @Autowired
    private PaymentsRepository repository;
    @GetMapping("/all")
    List<Payments> all() {
        List<Payments> payments = repository.findAll();

        return payments;
    }
}
