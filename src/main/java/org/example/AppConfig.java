package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(@Autowired Computer com){  //Computer com to look for a computer object in the ioc container. Autowiring between alien and desktop
        Alien obj=new Alien();
        obj.setAge(20);
        obj.setCom(com);  //calling desktop() method to assign setCom a Computer obj
        return obj;
    }

    @Bean(name = {"com2","desktop1"})
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }
//    @Bean(name = {"com1"})
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
