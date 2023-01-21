package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizza.com.PizzaRestApplication.DTO.Order_itemDTO;
import pizza.com.PizzaRestApplication.Entity.Order_item;
import pizza.com.PizzaRestApplication.Repository.Order_itemsRepository;
import pizza.com.PizzaRestApplication.Utility.ValueMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/items")
public class OrderItemsController {
    @Autowired
    private Order_itemsRepository repository;

    @GetMapping("/all")
    List<Order_itemDTO> all() {
        List<Order_item> orderItems = repository.findAll();
        return orderItems.stream().map(ValueMapper::mapOrderItemsToOrderItemsDTO).collect(Collectors.toList());
    }
}
