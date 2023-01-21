package pizza.com.PizzaRestApplication.DTO;

import pizza.com.PizzaRestApplication.RequiredMethods.BaseEntityInterface;

import java.util.Date;


public class UserDTO implements BaseEntityInterface {
    private Long id;
    private String email;
    private String password;
    private Date created_at;
    private String salt;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
