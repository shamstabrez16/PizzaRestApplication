package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizza.com.PizzaRestApplication.Entity.Promotions;
import pizza.com.PizzaRestApplication.Entity.Time_slots;
import pizza.com.PizzaRestApplication.Repository.PromotionsRepository;
import pizza.com.PizzaRestApplication.Repository.Time_slotsRepository;

import java.util.List;

@RestController
@RequestMapping("time_slots")
public class Time_slotsController {
    @Autowired
    private Time_slotsRepository repository;
    @GetMapping("/all")
    List<Time_slots> all() {
        List<Time_slots> time_slots = repository.findAll();
        return time_slots;
    }
}
