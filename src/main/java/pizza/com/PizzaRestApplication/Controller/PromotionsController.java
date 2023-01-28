package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizza.com.PizzaRestApplication.DTO.PromotionDTO;
import pizza.com.PizzaRestApplication.Entity.Promotion;
import pizza.com.PizzaRestApplication.Repository.PromotionsRepository;
import pizza.com.PizzaRestApplication.Utility.ValueMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/promotions")
public class PromotionsController {
    @Autowired
    private PromotionsRepository repository;
    @GetMapping("/all")
    List<PromotionDTO> all() {
        List<Promotion> promotions = repository.findAll();
        return promotions.stream().map(ValueMapper::mapPPromotionToPromotionDTO).collect(Collectors.toList());
    }
}
