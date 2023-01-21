package pizza.com.PizzaRestApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pizza.com.PizzaRestApplication.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order getOrderByCustomerId(int customerId) ;
}