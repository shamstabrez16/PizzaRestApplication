package pizza.com.PizzaRestApplication.DataLayer;

import org.springframework.beans.factory.annotation.Autowired;
import pizza.com.PizzaRestApplication.Entity.User;
import pizza.com.PizzaRestApplication.Repository.UsersRepository;

public class UserDataLayer {
    @Autowired
    private UsersRepository repository;
    public User Save(User user) {
       return repository.save(user);
    }
}
