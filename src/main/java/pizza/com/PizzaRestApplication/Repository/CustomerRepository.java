package pizza.com.PizzaRestApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pizza.com.PizzaRestApplication.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}