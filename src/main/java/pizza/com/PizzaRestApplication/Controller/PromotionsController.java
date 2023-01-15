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
@RequestMapping("/promotions")
public class PromotionsController {
    @Autowired
    private PromotionsRepository repository;
    @GetMapping("/all")
    List<Promotions> all() {
        List<Promotions> promotions = repository.findAll();
        return promotions;
    }
    @Autowired
    private Time_slotsRepository trepository;
    @GetMapping("/alll")
    List<Time_slots> alll() {
        List<Time_slots> time_slots = trepository.findAll();
        return time_slots;
    }
}
