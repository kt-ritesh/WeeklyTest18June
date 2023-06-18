package org.WeeklyTest.controller;

import org.WeeklyTest.emailSender.EmailSender;
import org.WeeklyTest.person.Person;
import org.WeeklyTest.person.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private personService personservice;

    @GetMapping("person")
    public String getPerson(){

        Person person = personservice.getPerson();
        person.setName("Ritesh Kumar Thakur");
        String personInString = person.toString();

        EmailSender.sendEmail("riteshkt101@gmail.com", "Weekly Test on 18 June", personInString);
        return personInString;
    }
}
