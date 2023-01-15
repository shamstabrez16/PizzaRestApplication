package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pizza.com.PizzaRestApplication.Entity.Order_items;
import pizza.com.PizzaRestApplication.Entity.Orders;
import pizza.com.PizzaRestApplication.Repository.Order_itemsRepository;
import pizza.com.PizzaRestApplication.Repository.OrdersRepository;

import java.util.List;

@RestController
@RequestMapping("/items")
public class OrderItemsController {
    @Autowired
    private Order_itemsRepository repository;

    @GetMapping("/all")
    List<Order_items> all() {

        return repository.findAll();
    }
}
