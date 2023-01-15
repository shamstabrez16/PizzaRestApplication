package pizza.com.PizzaRestApplication.Entity;

import jakarta.persistence.*;
import pizza.com.PizzaRestApplication.RequiredMethods.BaseEntityInterface;
import pizza.com.PizzaRestApplication.Utility.Helper;

import java.util.Date;

@Entity(name = "users")
public class Users implements BaseEntityInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String email;
    private String password;
    private Date created_at;
    private String salt;

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
   // }

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



    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", created_at=" + created_at +
                '}';
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
