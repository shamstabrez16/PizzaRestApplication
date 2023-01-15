package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizza.com.PizzaRestApplication.Entity.Payments;
import pizza.com.PizzaRestApplication.Entity.Pizzas;
import pizza.com.PizzaRestApplication.Repository.PaymentsRepository;
import pizza.com.PizzaRestApplication.Repository.PizzasRepository;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzasController {
    @Autowired
    private PizzasRepository repository;
    @GetMapping("/all")
    List<Pizzas> all() {
        List<Pizzas> payments = repository.findAll();
        return payments;
    }
}
