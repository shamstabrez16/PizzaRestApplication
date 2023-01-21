package pizza.com.PizzaRestApplication.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pizza.com.PizzaRestApplication.Entity.Payment;

public interface PaymentsRepository extends JpaRepository<Payment, Long> {
}