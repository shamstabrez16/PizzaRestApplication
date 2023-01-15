package pizza.com.PizzaRestApplication.Exception;

public class OrderExceptions extends RuntimeException {
    public OrderExceptions(Long id) {
        super("Could not find Order " + id);
    }
}
