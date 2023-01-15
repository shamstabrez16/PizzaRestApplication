package pizza.com.PizzaRestApplication.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pizza.com.PizzaRestApplication.Entity.Orders;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
    Orders getOrderByCustomerId(int customerId) ;
//    @Transactional
//    @Modifying
//    @Query("SELECT * FROM orders o INNER JOIN order_items oi ON o.order_id  = oi.order_id where o.customer_id  = ?1")
//    Orders getOrderInfoByCustomerId(int customerId);

}