package com.abhishek.learning;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String args[]){
        BeanFactory context = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("./src/beans.xml");
        HelloWorld object = (HelloWorld) context.getBean("helloWorld");
        System.out.println("With Bean Factory");
        System.out.println(object.getMessage());

        HelloWorld object1 = (HelloWorld) applicationContext.getBean("helloWorld");

        System.out.println("With Application Context Container");
        System.out.println(object1.getMessage());
    }
}
