package com.example.SpringBootDemo;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void getName(){
        System.out.print(name);
    }
}
