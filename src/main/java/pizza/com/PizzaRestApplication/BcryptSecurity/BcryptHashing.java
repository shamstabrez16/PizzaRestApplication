package pizza.com.PizzaRestApplication.BcryptSecurity;

import org.jetbrains.annotations.NotNull;

public class BcryptHashing {

    public  static  void  main(String[] args){
        String  originalPassword = "password";
        String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword, BCrypt.gensalt(12));
        System.out.println(generatedSecuredPasswordHash);

        boolean matched = BCrypt.checkpw(originalPassword, generatedSecuredPasswordHash);
        System.out.println(matched);
    }
    public static @NotNull String enCoding(String originalPassword, String genSalt) {

        String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword,genSalt );
        System.out.println(generatedSecuredPasswordHash);
        return generatedSecuredPasswordHash;

    }

    public static boolean deCoding(String originalPassword, String genSalt, String generatedPassword) {

        String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword,genSalt );
        return generatedSecuredPasswordHash.equals(generatedPassword);
        }
}
