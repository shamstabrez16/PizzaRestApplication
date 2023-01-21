package pizza.com.PizzaRestApplication.Business;

import pizza.com.PizzaRestApplication.BcryptSecurity.BCrypt;
import pizza.com.PizzaRestApplication.BcryptSecurity.BcryptHashing;
import pizza.com.PizzaRestApplication.Entity.User;
import pizza.com.PizzaRestApplication.Utility.Helper;

public class UserBusiness {
    public User buildNewUser(String email, String password) {
        User user = new User();
        user.setEmail(email);
        String genSalt = BCrypt.gensalt(12);
        user.setSalt(genSalt);
        user.setCreated_at(Helper.getCurrentDateNow());
        user.setPassword( BcryptHashing.enCoding(password,genSalt));
        return user;
    }
}
