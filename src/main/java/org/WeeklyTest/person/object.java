package org.WeeklyTest.person;

import org.WeeklyTest.person.personService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class object {
    @Bean
    public personService personservice(){
        return new personService();
    }
}
