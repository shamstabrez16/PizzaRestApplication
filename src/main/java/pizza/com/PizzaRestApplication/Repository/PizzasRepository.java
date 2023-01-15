package pizza.com.PizzaRestApplication.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pizza.com.PizzaRestApplication.Entity.Pizzas;

public interface PizzasRepository extends JpaRepository<Pizzas, Long> {
}