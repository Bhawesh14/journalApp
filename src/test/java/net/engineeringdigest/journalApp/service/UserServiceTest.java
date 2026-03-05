package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "ram",
            "bhawesh",
            "vikas",
            "shyam"
    })
    public void testFindByUserName(String name) {
        //User user = userRepository.findByUsername(name);
        //assertTrue(!user.getPassword().isEmpty());
        assertNotNull(userRepository.findByUsername(name),"failed for :" +name);
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "4,5,9",
            "4,3,5"
    })
    public void test(int a, int b, int expected) {
        assertEquals(expected, a + b);
    }

}
