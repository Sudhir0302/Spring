package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //using applicationcontext to create a obj of another class
        //applicationcontext contains a container where all objects are creted
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj= (Alien) context.getBean("alien");  //(Alien) typecasting
//        obj.setAge(13);
        System.out.println(obj.getAge());
        obj.code();
//        Alien obj2= (Alien) context.getBean("alien");
//        System.out.println(obj2.age);
//        obj2.code();
    }
}
