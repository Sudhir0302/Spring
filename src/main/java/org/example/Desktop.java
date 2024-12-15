package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("com2") //specifying bean name
@Primary
@Scope("prototype")
public class Desktop implements Computer{
    Desktop(){
        System.out.println("desktop created");
    }
    @Override
    public void compile(){
        System.out.println("compiling desktop");
    }
}
