package pizza.com.PizzaRestApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pizza.com.PizzaRestApplication.Entity.Order_items;

public interface Order_itemsRepository extends JpaRepository<Order_items, Long> {
}