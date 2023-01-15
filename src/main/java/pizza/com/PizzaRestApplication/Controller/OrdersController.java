package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza.com.PizzaRestApplication.Entity.Orders;
import pizza.com.PizzaRestApplication.Repository.OrdersRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrdersController {
    @Autowired
    private OrdersRepository repository;

    @GetMapping("/all")
    List<Orders> all() {
        return repository.findAll();
    }
    @PostMapping("/order")
    Orders newOrder(@RequestBody Orders newOrder) {
        return repository.save(newOrder);
    }
    @GetMapping("/order")
    Optional<Orders> one(@RequestParam("oid") long orderID ) {
       return repository.findById(orderID);
    }
    @GetMapping("/customer")
    Orders findByCustomer_id(@RequestParam("cid") int customerId ) {
        return repository.getOrderByCustomerId(customerId);
    }






}
