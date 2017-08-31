package com.abhishek.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld object = (HelloWorld) context.getBean("helloWorld");
        System.out.println(object.getMessage());
    }
}
