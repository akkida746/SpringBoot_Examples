package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    /*@Before("execution(public * *(..))")
    public void beforeName(){
        System.out.println("Called before advice");
    }*/

    @Before("execution(* com.example.aop.Customer.*.*(..))")
    public void beforeName(){
        System.out.println("Called before advice");
    }
}
