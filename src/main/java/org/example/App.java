package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        using java based configuration
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj= context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();
//        Desktop obj=context.getBean("desktop1",Desktop.class); //using bean name
//        Desktop obj=context.getBean(Desktop.class);
//        obj.compile();
//        Desktop obj1=context.getBean(Desktop.class);
//        obj1.compile();

//        Laptop obj2=(Laptop) context.getBean("com1");
//        obj2.compile();





 //using xml based configuration
        //using applicationcontext to create a obj of another class
        //applicationcontext contains a container where all objects are creted
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
////        Alien obj= (Alien) context.getBean("alien");  //(Alien) typecasting
//        Alien obj= context.getBean("alien", Alien.class);
////        obj.setAge(13);
//        System.out.println(obj.getAge());
//        obj.code();
////        Alien obj2= (Alien) context.getBean("alien");
////        System.out.println(obj2.age);
////        obj2.code();
//
////        Desktop obj1=(Desktop) context.getBean("com");
////        Desktop obj1=context.getBean("com",Desktop.class); //using without typecast
//        Desktop obj1=context.getBean(Desktop.class); //using without bean id
    }
}
