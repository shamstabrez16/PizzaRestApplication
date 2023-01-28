package pizza.com.PizzaRestApplication.DataLayer;

import org.springframework.beans.factory.annotation.Autowired;
import pizza.com.PizzaRestApplication.Entity.Users;
import pizza.com.PizzaRestApplication.Repository.UsersRepository;

public class UserDataLayer {
    @Autowired
    private UsersRepository repository;
    public Users Save(Users users) {
       return repository.save(users);
    }
}
