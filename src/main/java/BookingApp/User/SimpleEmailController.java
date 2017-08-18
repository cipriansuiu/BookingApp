package BookingApp.User;


import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleEmailController {
    
    @Autowired
    private JavaMailSender sender;

    @RequestMapping("/simpleemail")
    @CrossOrigin
    @ResponseBody
    String home() {
        try {
          sendEmail("lpemilian@gmail.com");
            return "Email Sent!";
        }catch(Exception ex) {
            return "Error in sending email: "+ex;
        }
    }

    public void sendEmail(String email) throws Exception{
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        
        helper.setTo(email);
        helper.setText("Thank you for registering with us");
        helper.setSubject("Registration confirmation");
        
        sender.send(message);
    }
}