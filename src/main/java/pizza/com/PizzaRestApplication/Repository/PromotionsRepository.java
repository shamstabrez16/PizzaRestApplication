package pizza.com.PizzaRestApplication.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pizza.com.PizzaRestApplication.Entity.Promotions;

public interface PromotionsRepository extends JpaRepository<Promotions, Long> {
}