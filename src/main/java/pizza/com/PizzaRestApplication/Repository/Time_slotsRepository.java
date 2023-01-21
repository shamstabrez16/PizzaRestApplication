package pizza.com.PizzaRestApplication.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pizza.com.PizzaRestApplication.Entity.Time_slot;

public interface Time_slotsRepository extends JpaRepository<Time_slot, Long> {
}