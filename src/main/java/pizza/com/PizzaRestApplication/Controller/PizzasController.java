package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizza.com.PizzaRestApplication.DTO.PizzaDTO;
import pizza.com.PizzaRestApplication.Entity.Pizza;
import pizza.com.PizzaRestApplication.Repository.PizzasRepository;
import pizza.com.PizzaRestApplication.Utility.ValueMapper;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pizzas")
public class PizzasController {
    @Autowired
    private PizzasRepository repository;
    @GetMapping("/all")
    List<PizzaDTO> all() {
        List<Pizza> pizzas = repository.findAll();
        return pizzas.stream().map(ValueMapper::mapPizzaToPizzaDTO).collect(Collectors.toList());
    }
}
