package com.emmutua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController //this means that any method within the class @GetMapping will be exposed at rest
// endpoints for clients to call
//the response under this annotation is a Json response
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    //building a simple API in spring boot
    @GetMapping ("/greet")
    public GreetResponse greet(){
       GreetResponse response = new GreetResponse(new person("Emmanuel",22,30_000),List.of("Java","Golang","JavaScript"),"Hello Dev");
        return response;
    }
    record person(String name,int age, double savings){}
    record GreetResponse(person person, List<String> programmingLanguages, String greet){}

}
/**
 * tomcat = Embedded web server, can also use jetty
 * Tomcat is listening on port 8080 -
 */