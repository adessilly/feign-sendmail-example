package com.example.testmail.controllers;

import com.example.testmail.dto.Mail;
import com.example.testmail.dto.MailUser;
import com.example.testmail.services.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController()
public class MailController {

    @Autowired
    public MailSender brevoMailSender;

    @GetMapping("/sendmail")
    public String hello() {

        MailUser to = new MailUser();
        to.setName("Adrien");
        to.setEmail("adessilly@gmail.com");

        MailUser from = new MailUser();
        from.setName("PixelPerfect");
        from.setEmail("info@pixel-perfect.be");

        Mail mail = new Mail();
        mail.setTo( new ArrayList<>() );
        mail.getTo().add(to);

        mail.setSender(from);
        mail.setHtmlContent("<strong>MAIL FROM JAVA APP WITH FEIGN AND BREVO</strong>");
        mail.setSubject("Test email");

        this.brevoMailSender.sendMail(mail);
        return "MAIL SENT!";
    }

}
