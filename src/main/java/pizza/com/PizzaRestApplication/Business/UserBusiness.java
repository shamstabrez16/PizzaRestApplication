package pizza.com.PizzaRestApplication.Business;

import pizza.com.PizzaRestApplication.BcryptSecurity.BCrypt;
import pizza.com.PizzaRestApplication.BcryptSecurity.BcryptHashing;
import pizza.com.PizzaRestApplication.Entity.Users;
import pizza.com.PizzaRestApplication.Utility.Helper;

public class UserBusiness {
    public Users buildNewUser(String email, String password) {
        Users users = new Users();
        users.setEmail(email);
        String genSalt = BCrypt.gensalt(12);
        users.setSalt(genSalt);
        users.setCreated_at(Helper.getCurrentDateNow());
        users.setPassword( BcryptHashing.enCoding(password,genSalt));
        return users;
    }
}
