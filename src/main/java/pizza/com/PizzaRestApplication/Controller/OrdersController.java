package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza.com.PizzaRestApplication.DTO.OrderDTO;
import pizza.com.PizzaRestApplication.Entity.Order;
import pizza.com.PizzaRestApplication.Repository.OrderRepository;
import pizza.com.PizzaRestApplication.Utility.ValueMapper;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrderRepository repository;

    @GetMapping("/all")
    List<OrderDTO> all() {
        List<Order> orders= repository.findAll();
        return orders.stream().map(ValueMapper::mapOrderToOrderDTO).collect(Collectors.toList());
    }
    @PostMapping("/order")
    OrderDTO newOrder(@RequestBody Order newOrder) {
        Order order= repository.save(newOrder);
        return ValueMapper.mapOrderToOrderDTO(order);
    }
    @GetMapping("/order")
    OrderDTO one(@RequestParam("oid") long orderID ) {
        Optional<Order> order = repository.findById((int) orderID);
         return ValueMapper.OptionalMapOrderToOrderDTO(order);
    }
    @GetMapping("/customer")
    OrderDTO findByCustomer_id(@RequestParam("cid") int customerId ) {
        Optional<Order> order = Optional.ofNullable(repository.getOrderByCustomerId(customerId));
        return ValueMapper.OptionalMapOrderToOrderDTO(order);
    }


}
