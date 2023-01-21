package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pizza.com.PizzaRestApplication.Business.UserBusiness;
import pizza.com.PizzaRestApplication.BcryptSecurity.BcryptHashing;
import pizza.com.PizzaRestApplication.DTO.UserDTO;
import pizza.com.PizzaRestApplication.Entity.User;
import pizza.com.PizzaRestApplication.Repository.UsersRepository;
import pizza.com.PizzaRestApplication.Utility.ValueMapper;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersRepository repository;

    @GetMapping("/all")
    List<UserDTO> all() {
        List<User> orders = repository.findAll();
       return orders.stream().map(ValueMapper::mapUserToUserDTO).collect(Collectors.toList());
    }

    @PostMapping("/new")
    UserDTO newUser(@Param("email") String email, @Param("password") String password){
        UserBusiness userBusiness = new UserBusiness();
        User user = userBusiness.buildNewUser(email, password);
        user= repository.save(user);
        return  ValueMapper.mapUserToUserDTO(user);
    }
    @GetMapping ("/validate")
    boolean validate(@Param("email") String email, @Param("password") String password){
       User user = repository.getUserByEmail(email);
      return BcryptHashing.deCoding(password, user.getSalt(), user.getPassword());
    }
    @DeleteMapping ("/delete")
    ResponseEntity delete(@Param("email") String email, @Param("password") String password){
        User user = repository.getUserByEmail(email);
         if(BcryptHashing.deCoding(password, user.getSalt(), user.getPassword()))
        {
            repository.deleteById(user.getId());
            return new ResponseEntity("Deleted user : "+ user.getEmail(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity("Couldn't Delete user, Please check user Id and password : "+ user.getEmail(), HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("/update")
    int changePassword(@Param("email") String email, @Param("password") String password,@Param("newpassword") String newpassword){
        User user = repository.getUserByEmail(email);
        if(user != null && BcryptHashing.deCoding(password, user.getSalt(), user.getPassword())) {

           return repository.changePassword(BcryptHashing.enCoding(newpassword, user.getSalt()),email);
        }
        else {
            return new ResponseEntity("Incorrect username or password",HttpStatus.FORBIDDEN).getStatusCodeValue();
        }
    }
}
