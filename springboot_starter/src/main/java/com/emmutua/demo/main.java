package com.emmutua.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class main {
    public static void main(String[] args) {

        ApplicationContext apc = SpringApplication.run(main.class, args);
        for (String i: apc.getBeanDefinitionNames()){
            System.out.println(i);
        }
    }
}

@Component
class doctor{
    public void assist(){
        System.out.println("Doctor is assisting");
    }
}