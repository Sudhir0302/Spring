package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    use @Autowired is optional
//    @Qualifier("com1")
//    @Bean
//    public Alien alien(Computer com){  //Computer com to look for a computer object in the ioc container. Autowiring between alien and desktop
//        Alien obj=new Alien();
//        obj.setAge(20);
//        obj.setCom(com);  //calling desktop() method to assign setCom a Computer obj
//        return obj;
//    }
//
//    @Bean(name = {"com2","desktop1"})
//    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//
//    @Bean(name = {"com1"})
//    @Primary  //to tell it is the first preferred obj(laptop)
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
