package org.example;

public class Desktop implements Computer{
    Desktop(){
        System.out.println("desktop created");
    }
    @Override
    public void compile(){
        System.out.println("compiling desktop");
    }
}
