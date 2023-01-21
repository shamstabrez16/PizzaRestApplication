package pizza.com.PizzaRestApplication.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pizza.com.PizzaRestApplication.Entity.Pizza;

public interface PizzasRepository extends JpaRepository<Pizza, Long> {
}