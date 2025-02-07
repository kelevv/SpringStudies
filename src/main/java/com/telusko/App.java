package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = context.getBean("alien1", Alien.class);
        //obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien1");
//        System.out.println(obj2.getAge());
//
//        obj2.code();

//        Computer com = context.getBean(Computer.class);
//
//        Desktop obj = context.getBean(Desktop.class);
    }
}
