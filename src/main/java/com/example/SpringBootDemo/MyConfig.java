package com.example.SpringBootDemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean(name="person1")
    public Person getPerson1(){
        return new Person("person1");
    }

    @Bean(name="person2")
    public Person getPerson2(){
        return new Person("person2");
    }
}
