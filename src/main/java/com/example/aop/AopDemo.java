package com.example.aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopDemo {
    public static void main(String... args){

        SpringApplication.run(AopDemo.class,args);
    }

    CommandLineRunner cml = (String... args)->{
        Customer Customer = new Customer();
        Customer.setName("Akash");

        System.out.println(Customer.getName());
    };
}
