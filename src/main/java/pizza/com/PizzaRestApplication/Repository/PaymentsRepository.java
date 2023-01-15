package pizza.com.PizzaRestApplication.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pizza.com.PizzaRestApplication.Entity.Payments;

public interface PaymentsRepository extends JpaRepository<Payments, Long> {
}