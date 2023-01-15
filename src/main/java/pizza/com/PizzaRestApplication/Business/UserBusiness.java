package pizza.com.PizzaRestApplication.Business;

import pizza.com.PizzaRestApplication.BcryptSecurity.BCrypt;
import pizza.com.PizzaRestApplication.BcryptSecurity.BcryptHashing;
import pizza.com.PizzaRestApplication.Entity.Users;
import pizza.com.PizzaRestApplication.Utility.Helper;

public class UserBusiness {
    public Users buildNewUser(String email, String password) {
        Users user = new Users();
        user.setEmail(email);
        String genSalt = BCrypt.gensalt(12);
        user.setSalt(genSalt);
        user.setCreated_at(Helper.getCurrentDateNow());
        user.setPassword( BcryptHashing.enCoding(password,genSalt));
        return user;
    }
}
