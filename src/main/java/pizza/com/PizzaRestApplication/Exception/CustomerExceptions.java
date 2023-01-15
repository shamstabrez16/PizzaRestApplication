package pizza.com.PizzaRestApplication.Exception;

public class CustomerExceptions extends  RuntimeException{
    public CustomerExceptions(Long id) {
        super("Could not find Customer " + id);
    }
}
