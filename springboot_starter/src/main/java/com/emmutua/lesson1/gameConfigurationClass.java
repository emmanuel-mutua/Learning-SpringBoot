package com.emmutua.lesson1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age, Address address){}
record Address(String firstname, String city){}
@Configuration
public class gameConfigurationClass {
    @Bean
    public String name(){
        return "Emmanuel";
    }
    @Bean
    public Integer age(){
        return 15;
    }

    @Bean Person person1(){
        return new Person("Mutua",22, new Address("Kigajo","Kwa Askari"));
    }
    //using method call to call a bean
    @Bean
    public Person person(){
        return new Person(name(),age(), address());
    }
    //using parameters
    @Bean
    public Person person2(String name, int age, Address address2){
        return new Person(name,age, address2);
    }
    @Bean
    public Address address(){
        return new Address("Kilimani Street", "Nairobi");
    }
    @Bean
    public Address address2(){
        return new Address("Kalula Street", "KenyaCityHole");
    }
}

