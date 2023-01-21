package pizza.com.PizzaRestApplication.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pizza.com.PizzaRestApplication.Entity.Promotion;

public interface PromotionsRepository extends JpaRepository<Promotion, Long> {
}