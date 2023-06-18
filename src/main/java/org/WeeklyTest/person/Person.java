package org.WeeklyTest.person;

import org.springframework.stereotype.Component;

import java.security.PublicKey;
@Component
public class Person {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    @Override
    public String toString(){
        return "The person name is "+Name;
    }
}
