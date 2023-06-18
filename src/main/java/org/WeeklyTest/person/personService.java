package org.WeeklyTest.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class personService {
    @Autowired
    private Person person;

    public String getPersonName(){
        return person.getName();
    }

    public Person getPerson() {
        return person;
    }
}
