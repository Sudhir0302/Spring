package org.example;

public class Laptop implements Computer {
//    public Laptop(){
//        System.out.println("Laptop object creation");
//    }

    @Override
    public void compile(){
        System.out.println("compiling laptop");
    }
}
