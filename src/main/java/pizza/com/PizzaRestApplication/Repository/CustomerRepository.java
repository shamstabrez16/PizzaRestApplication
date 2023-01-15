package pizza.com.PizzaRestApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pizza.com.PizzaRestApplication.Entity.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Long> {

}