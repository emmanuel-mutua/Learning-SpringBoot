package com.emmutua.lesson1;
//implementing auto wiring in spring framework
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//learning tight and loose coupling in java
//loose coupling is faster and can be implemented with creating an interface
public class mainWithSpring {
    public static void main(String[] args) {
        //launch a spring application and create a context of the application
       var context = new AnnotationConfigApplicationContext(gameConfigurationClass.class);

        //configure and use the configuration class to manage all the spring beans
        // are the objects that are managed by spring
        //at gameConfiguration class @configuration

        //retreave beans from the configuration class

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
       // System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
       // System.out.println(context.getBean("address.class"));


    }
}
