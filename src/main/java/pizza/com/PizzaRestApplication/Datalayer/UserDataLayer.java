package pizza.com.PizzaRestApplication.Datalayer;

import org.springframework.beans.factory.annotation.Autowired;
import pizza.com.PizzaRestApplication.Entity.Users;
import pizza.com.PizzaRestApplication.Repository.UsersRepository;

public class UserDataLayer {
    @Autowired
    private UsersRepository repository;
    public Users Save(Users user) {
       return repository.save(user);
    }
}
