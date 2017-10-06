package io.github.mhanjung.sendingemail.controller;

import io.github.mhanjung.sendingemail.domain.User;
import io.github.mhanjung.sendingemail.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private Logger log = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/signup")
    public String signup() {
        return "Please sign up for our service.";
    }

    @RequestMapping("/signup-success")
    public String signupSuccess() {

        User user = new User();
        user.setFirstName("Han");
        user.setLastName("Jung");
        user.setEmailAddress("mhanjung@gmail.com");

        try {
            notificationService.sendNotification(user);
        } catch (MailException e) {
            log.info(e.getMessage());
        }

        return "Thank you for registering with us.";
    }
}
