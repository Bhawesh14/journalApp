package net.engineeringdigest.journal_app.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Test
    public void emailServiceTest() {
        emailService.sendEmail("franklinangel8888@gmail.com", "Email Sender Test", "Just Testing Email Sender through java mail sender");
    }
}
