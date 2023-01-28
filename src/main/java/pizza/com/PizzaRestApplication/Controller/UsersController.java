package pizza.com.PizzaRestApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pizza.com.PizzaRestApplication.BcryptSecurity.BcryptHashing;
import pizza.com.PizzaRestApplication.Business.UserBusiness;
import pizza.com.PizzaRestApplication.DTO.UserDTO;
import pizza.com.PizzaRestApplication.Entity.Users;
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
        List<Users> users = repository.findAll();
        for (Users u: users
             ) {
            System.out.println(u.getEmail());
        }
      //  return  users;
       return users.stream().map(ValueMapper::mapUserToUserDTO).collect(Collectors.toList());
    }

    @PostMapping("/new")
    UserDTO newUser(@Param("email") String email, @Param("password") String password){
        UserBusiness userBusiness = new UserBusiness();
        Users users = userBusiness.buildNewUser(email, password);
        users = repository.save(users);
        return  ValueMapper.mapUserToUserDTO(users);
    }
    @GetMapping ("/validate")
    boolean validate(@Param("email") String email, @Param("password") String password){
       Users users = repository.getUserByEmail(email);
      return BcryptHashing.deCoding(password, users.getSalt(), users.getPassword());
    }
    @DeleteMapping ("/delete")
    ResponseEntity delete(@Param("email") String email, @Param("password") String password){
        Users users = repository.getUserByEmail(email);
         if(BcryptHashing.deCoding(password, users.getSalt(), users.getPassword()))
        {
            repository.deleteById(users.getId());
            return new ResponseEntity("Deleted user : "+ users.getEmail(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity("Couldn't Delete user, Please check user Id and password : "+ users.getEmail(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    int changePassword(@Param("email") String email, @Param("password") String password,@Param("newpassword") String newpassword){
        Users users = repository.getUserByEmail(email);
        if(users != null && BcryptHashing.deCoding(password, users.getSalt(), users.getPassword())) {

           return repository.changePassword(BcryptHashing.enCoding(newpassword, users.getSalt()),email);
        }
        else {
            return new ResponseEntity("Incorrect username or password",HttpStatus.FORBIDDEN).getStatusCodeValue();
        }
    }
}
