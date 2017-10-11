# Sending Email In Spring Boot

Just a simple way to send Email in Spring boot.

### Email Sender, Contents Setting
In application.properties:
```
spring.mail.username=YOUR_GMAIL_ACCOUNT@gmail.com
spring.mail.password=YOUR_PASSWORD
```
In NotificationService.java:
```
mail.setSubject("Toys for shots is coming Soon!");
mail.setText("This is a cool email notification");
```

### Email Receiver Setting
In RegistrationController:
```
user.setFirstName("Han");
user.setLastName("Jung");
user.setEmailAddress("mhanjung@gmail.com");
```

### Email Receiver setting in HTML
URL:
```
http://localhost:8080/email.html
```

### Trouble shooting
    
Case 1:
[javax.mail.AuthenticationFailedException is thrown while sending email in java](https://stackoverflow.com/questions/25341198/javax-mail-authenticationfailedexception-is-thrown-while-sending-email-in-java)

## Author

This example was created by [Han Jung](http://mhanjung.github.io).