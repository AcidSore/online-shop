package shopAdmin.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderGenerator {
//    public static void main(String[] args) {
//        System.out.println(codePassword("admin123"));
//        System.out.println(codePassword("123456"));
//    }


   private static String codePassword (String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        return hashedPassword;
    }
}
