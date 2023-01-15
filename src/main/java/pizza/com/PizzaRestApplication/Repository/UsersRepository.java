package pizza.com.PizzaRestApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;
import pizza.com.PizzaRestApplication.Entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    @Transactional
    @Modifying
    @Query("update users u set u.password = ?1 where u.email like ?2")
    int changePassword(@NonNull String password, @NonNull String email);
    Users getUserByEmail(String email);
}
