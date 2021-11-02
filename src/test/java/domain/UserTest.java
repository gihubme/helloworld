package domain;

import domain.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserTest {

    public void testCreateUser(){
        User user = User.builder().lastname("Leminta")
                .firstname("Lerroy")
                .email("lerroy2345@yahoo.com")
                .build();
        log.warn("New user: "+user);
    }

    public void testGetterAndSetter(){
        User user = new User();
        user.setEmail("moname22@idli.com");
        user.setFirstname("Krap");
        user.setLastname("Kraptree");
        log.info("email: "+user.getEmail());
        log.info("name: "+user.getFirstname()+" "+user.getLastname());
    }

    public void testAllArgs(){
        User user = new User("Bert","Malloy","mila@xera.com");
        log.info("AllArgs user: "+user);
    }
}
